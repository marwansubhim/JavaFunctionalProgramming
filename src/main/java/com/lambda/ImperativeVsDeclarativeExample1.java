package com.lambda;

import java.util.stream.IntStream;

/**
 * Created by: Marwan on 12/19/2021 around 9:01 PM
 */
public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        // Imperative style of programming - how style of programming

        int sum1 = 0;
        for (int i = 0; i <= 100; i++) {
            sum1 += i;
        }
        System.out.println("Sum using imperative approach is: " + sum1);

        // Declarative style of programming - what style of programming

        int sum2 = IntStream.rangeClosed(0, 100).parallel().sum();
        System.out.println("Sum using declarative approach is: " + sum2);


    }
}
