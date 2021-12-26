package com.functionalInterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * Created by: Marwan on 12/24/2021 around 2:02 PM
 */
public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction =
            (students) -> {
                Map<String, Double> studentGradeMap = new HashMap<>();
                students.forEach(student -> {
                    if (PredicateStudentExample.isGpaGreaterThan3.test(student))
                    studentGradeMap.put(student.getName(), student.getGpa());
                });
                return studentGradeMap;
            };

    /*
                for (Student eachStudent : students) {
                    studentGradeMap.put(eachStudent.getName(),eachStudent.getGpa());
                }

         */

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        System.out.println(studentFunction.apply(studentList));

    }
}
