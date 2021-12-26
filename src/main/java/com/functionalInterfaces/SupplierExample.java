package com.functionalInterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by: Marwan on 12/24/2021 around 6:37 PM
 */
public class SupplierExample {

    /**
     * Supplier is used to return date without any giving parameters, we basically just provide the data type we want to return
     * It works exactly the opposite of Consumer which take something and return void
     */
    Supplier<Student> studentSupplier = () -> {
        return new Student("Marwan", 3, 4.0, "male", 12, Arrays.asList("swimming", "gymnastics", "boxing"));
    };
    Supplier<List<Student>> studentsSupplier = StudentDataBase::getAllStudents;


    public static void main(String[] args) {

        System.out.println(new SupplierExample().studentSupplier.get());
        System.out.println("*******************************************");
        System.out.println(new SupplierExample().studentsSupplier.get());
    }
}
