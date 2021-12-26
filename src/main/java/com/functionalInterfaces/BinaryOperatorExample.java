package com.functionalInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * Created by: Marwan on 12/24/2021 around 6:22 PM
 */
public class BinaryOperatorExample {

    /**
     * Binary operator takes two inputs and produce one output of the same type
     */

    static BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
    static BinaryOperator <Integer[]> combineTwoArrays = (a,b) ->{
        Integer[] arr = new Integer[a.length+b.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            arr[j++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            arr[j++] = b[i];
        }
        return arr;
    };
    static Comparator<Integer> comparator = Integer::compareTo;

    public static void main(String[] args) {

        System.out.println(binaryOperator.apply(2, 5));
        System.out.println(Arrays.toString(combineTwoArrays.apply(new Integer[]{1,21,3},new Integer[]{6,5,8})));
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Results of maxBy is: "+maxBy.apply(6,3));
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Results of minBy is: "+minBy.apply(10,2));


    }
}
