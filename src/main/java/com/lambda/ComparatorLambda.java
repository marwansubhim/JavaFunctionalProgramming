package com.lambda;

import java.util.Comparator;

/**
 * Created by: Marwan on 12/19/2021 around 10:22 PM
 */
public class ComparatorLambda {

    public static void main(String[] args) {
        // legacy imperative way
        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of comparator1 is "+comparator1.compare(30,30));


        // declarative way
        Comparator<Integer> comparator2 = (a,b)-> a.compareTo(b);
        System.out.println("Result of comparator using lambda is "+comparator2.compare(20,3));

    }
}
