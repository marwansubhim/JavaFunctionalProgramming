package com.functionalInterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * Created by: Marwan on 12/24/2021 around 2:25 PM
 */
public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction =
            (students, studentPredicate) -> {
                Map<String, Double> studentGradeMap = new HashMap<>();
                students.forEach(eachStudent -> {
                    if (studentPredicate.test(eachStudent)) {
                        studentGradeMap.put(eachStudent.getName(), eachStudent.getGpa());
                    }
                });
                return studentGradeMap;
            };

    public static void main(String[] args) {
        List<Student>studentList =StudentDataBase.getAllStudents();

        System.out.println(biFunction.apply(studentList, PredicateStudentExample.isGpaGreaterThan3));
    }
}
