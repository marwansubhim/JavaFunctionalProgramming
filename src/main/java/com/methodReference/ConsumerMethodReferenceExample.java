package com.methodReference;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.function.Consumer;

/**
 * Created by: Marwan on 12/24/2021 around 7:02 PM
 */
public class ConsumerMethodReferenceExample {


    /**
     * Class::instanceMethod
     */
    static Consumer<Student>  c1= System.out::println;


    /**
     * instance::instanceMethod
     */
    static Consumer<Student> c2 = (student -> student.printListOfActivities());
    static Consumer<Student> c3 = (Student::printListOfActivities);

    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
        StudentDataBase.getAllStudents().forEach(c3);
    }

}
