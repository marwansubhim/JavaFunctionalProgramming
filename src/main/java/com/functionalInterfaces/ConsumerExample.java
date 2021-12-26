package com.functionalInterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by: Marwan on 12/19/2021 around 10:36 PM
 */
public class ConsumerExample {

    static Consumer<Student> consumer = System.out::println;
    static Consumer<Student> nameConsumer = p -> System.out.print(p.getName());
    static Consumer<Student> activitiesConsumer = p -> System.out.println(p.getActivities());
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printStudentNames() {
        // List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer);
    }

    public static void printNameAndActivities() {
        // List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(nameConsumer.andThen(activitiesConsumer)); // consumer chaining
    }

    public static void printNameAndActivitiesConditionally() {
        studentList.forEach(student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa()>3.9) nameConsumer.andThen(activitiesConsumer).accept(student);
        });

    }

    public static void main(String[] args) {

        /*Consumer<String> stringConsumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };
        Consumer<String> stringConsumer2 = a -> System.out.println(a.toUpperCase());

        stringConsumer1.accept("hello");
        stringConsumer2.accept("good morning");
        Function<Integer, String> function = a -> {
            if (a % 2 == 0) return "even";
            else return "odd";
        };
        System.out.println(function.apply(52487));*/

        Consumer<String> consumer1 = a -> System.out.println("Hello ".concat(a).toLowerCase());
        consumer1.accept("MARWAN");
        Consumer<Integer> consumer2 = a -> System.out.println(a.equals(2));
        consumer2.accept(5);
        Consumer<int[]> consumer3 = a -> {
            for (int i : a) {
                System.out.println(i);
            }
        };
        consumer3.accept(new int[]{1, 2, 3, 4, 5, 6});
        /*****************************************************/
        printStudentNames();
        System.out.println("***********************************************************");
        printNameAndActivities();
        System.out.println("***********************************************************");
        printNameAndActivitiesConditionally();

    }
}
