package com.functionalInterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by: Marwan on 12/20/2021 around 12:14 PM
 */
public class PredicateStudentExample {


    static Predicate<Student> isStudentGradeGreaterThan3 = p -> p.getGradeLevel() >= 3;
    static Predicate<Student> isGpaGreaterThan3 = p -> p.getGpa() >= 3.9;
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void filterStudentByGradeLevel() {

        studentList.forEach(student -> {
            if (isStudentGradeGreaterThan3.test(student))
                System.out.println("Student name is: " + student.getName() + " Student grade level is: " + student.getGradeLevel());
        });
    }

    public static void getStudentsByGPA() {
        studentList.forEach(p -> {
            if (isGpaGreaterThan3.test(p))
                System.out.println("Student name is: " + p.getName() + " Student GPA is: " + p.getGpa());
        });
    }

    public static void filterStudents() {
        studentList.forEach(p -> {
            if (isGpaGreaterThan3.and(isStudentGradeGreaterThan3).test(p))
                System.out.println(p);
        });

    }

    public static void main(String[] args) {
        System.out.println("******************************************************");
        filterStudentByGradeLevel();
        System.out.println("********************************************");
        getStudentsByGPA();
        System.out.println("********************************************");
        filterStudents();

    }
}
