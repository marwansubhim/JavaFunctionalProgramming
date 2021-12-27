package com.data;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Marwan on 12/26/2021 around 7:56 PM
 */
public class MockData {
    static ObjectMapper objectMapper = new ObjectMapper();

    public static List<Person> getAllPeople() {
        List<Person> people = new ArrayList<>();
        try {
            people = Arrays.asList(objectMapper.readValue(Paths.get("resources/people.json").toFile(), Person[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            return people;
        }

    }

    public static List<Car> getAllCars(){
        List<Car> cars = new ArrayList<>();
        try {
            cars = Arrays.asList(objectMapper.readValue(Paths.get("resources/cars.json").toFile(), Car[].class));
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            return cars;
        }
    }
}
