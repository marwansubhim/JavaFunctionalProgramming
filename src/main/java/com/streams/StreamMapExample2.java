package com.streams;

import com.data.MockData;
import com.data.Person;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Marwan on 12/26/2021 around 8:46 PM
 */
public class StreamMapExample2 {

    public static void main(String[] args) {
        /**
         * Get all names of people who's age greater than 35 years old
         */
        List<String> peopleAbove20Years = MockData.getAllPeople()
                .stream()
                .filter(p -> p.getAge() > 45) // filter always comes before map
                .map(Person::getFirstName)// here we are getting just their name
                .collect(Collectors.toList()); // storing the names into a list of string

        System.out.println(peopleAbove20Years.size());

    }
}
