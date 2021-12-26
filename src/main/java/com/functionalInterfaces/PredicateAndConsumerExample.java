package com.functionalInterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.function.*;

/**
 * Created by: Marwan on 12/21/2021 around 1:15 PM
 */
public class PredicateAndConsumerExample {

    Predicate<Student> getGradeLevel = s -> s.getGradeLevel() >= 3;
    Predicate<Student> getGpaLevel = s -> s.getGpa() >= 3.9;
    BiConsumer<String, List<String>> studentListBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    Consumer<Student> studentConsumer = (student) -> {
        if (biPredicate.test(student.getGradeLevel(),student.getGpa())) {
            studentListBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNamesAndActivities(List<Student> students) {
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNamesAndActivities(studentList);



        /*
        String str = "aa bb cc dd ee ff";
        str = str.replace("d", "w");
        System.out.println(str);
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ') count++;
        }
        System.out.println(count);
        Function<String, Integer> countStringSpaces = (a) -> {
            int freq = 0;
            for (int i = 0; i < a.length() - 1; i++) {
                if (a.charAt(i) == ' ') freq++;
            }
            return freq;
        };

        System.out.println(countStringSpaces.apply("a df dfdf ertret rt rtrtrt rt trrt rt rt t rtrtytysdfsd  er e werewr "));

         */


    }
}
