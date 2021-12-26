package com.functionalInterfaces;

import com.data.Student;
import com.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * Created by: Marwan on 12/20/2021 around 9:28 AM
 */
public class BiConsumerExample {

    public static void nameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        // the objective is to print the names and activities using the biConsumer interface
        BiConsumer<String,List<String>> biConsumer = (name,activities)-> System.out.println(name+" : "+activities);
        studentList.forEach(p -> biConsumer.accept(p.getName(),p.getActivities()));
    }
    public static void main(String[] args) {


        BiConsumer<String,String > biConsumer = (a,b)-> System.out.println(a+" "+b);
        biConsumer.accept("hello"," everyone");
        BiConsumer<Integer,Integer> multiplication = (a,b)-> System.out.println("Multiplication is "+(a*b));
      //  multiply.accept(5,5);
        BiConsumer<Integer,Integer> division = (a,b)-> System.out.println("Division is: "+(a/b));
      //  division.accept(8,2);
        BiConsumer<Integer,Integer> addition = (a,b)-> System.out.println("Addition is: "+(a+b));
      //  addition.accept(4,9);
        BiConsumer<Integer,Integer> subtraction = (a,b)-> System.out.println("Subtraction is: "+(a-b));
      //  subtraction.accept(10,4);
        addition.andThen(subtraction).andThen(division).andThen(multiplication).accept(10,2);

        System.out.println("*************************************************************");
        nameAndActivities();

    }
}
