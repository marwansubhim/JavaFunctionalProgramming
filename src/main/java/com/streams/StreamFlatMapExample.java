package com.streams;

import com.data.Student;
import com.data.StudentDataBase;
import java.util.List;
import static java.util.stream.Collectors.*;

/**
 * Created by Marwan on 12/26/2021 around 7:13 PM
 */
public class StreamFlatMapExample {

    public static void main(String[] args) {

        List<String> getAllActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toList());

        System.out.println(getAllActivities);
    }
}
