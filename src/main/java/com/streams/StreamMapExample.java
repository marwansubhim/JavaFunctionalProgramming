package com.streams;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Marwan on 12/26/2021 around 12:58 AM
 */
public class StreamMapExample {

    public static void main(String[] args) {
        /**
         * To collect all the names of the students and print them into the console
         */

//        Function<List<Student>, List<String>> studentsNameList = a -> {
//            List<String> names = new ArrayList<>();
//            for (Student each : a) {
//                names.add(each.getName());
//            }return names;
//        };
        List<String> studentsNamesList =
                StudentDataBase.getAllStudents()
                        .stream()
                        .map(Student::getName)
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

        System.out.println(studentsNamesList);

        /**
         * get all names and in a form of set
         */

        Set<String> studentsNamesSet =
                StudentDataBase.getAllStudents()
                        .stream()
                        .map(Student::getName)
                        .map(String::toUpperCase)
                        .collect(Collectors.toSet());

        System.out.println(studentsNamesSet);


        /**
         * Get all list of activities of each student
         */


        List<List<String>> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .collect(Collectors.toList());
        System.out.println(studentActivities);

    }
}
