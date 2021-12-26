package com.streams;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Marwan on 12/25/2021 around 11:42 PM
 */
public class StreamExample {

    /**
     * The objective of this task is to use stream to be able to store the names of each student and their respective
     * activities inside a map object without using traditional loops
     *
     * @param args
     */
    public static void main(String[] args) {
        Predicate<Student> studentGradeLevel = student -> student.getGradeLevel() >= 3;
        Predicate<Student> studentGpa = student -> student.getGpa() >= 3.9;
        Map<String, List<String>> studentListMap = StudentDataBase.getAllStudents()
                .stream()
                .filter(studentGradeLevel)
                .filter(studentGpa)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));// very useful use case of the method reference

        System.out.println(studentListMap);
        /**
         * as we can observe how amazingly the stream API is when it comes to filtering the results and perform
         * the logic is a declarative way compared to the imperative style of programming
         */


    }
}
