package com.functionalInterfaces;

import java.util.function.UnaryOperator;

/**
 * Created by: Marwan on 12/24/2021 around 6:11 PM
 */
public class UnaryOperatorExample {

    /**
     * unary operator acts like a function where input and output of the same type
      */

    static UnaryOperator<String> unaryOperator = s -> s.concat("default");
    static UnaryOperator<String> reverse = s -> {
        String reverse = "";
        for (int i = s.split("").length-1; i >= 0; i--) {
            reverse +=s.split("")[i];
        }
       return reverse;
    };

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java "));
        System.out.println(reverse.apply("olleH"));
    }
}
