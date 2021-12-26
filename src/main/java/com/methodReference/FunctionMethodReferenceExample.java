package com.methodReference;

import java.util.function.Function;

/**
 * Created by: Marwan on 12/24/2021 around 6:56 PM
 */
public class FunctionMethodReferenceExample {


    static Function<String, String> toUpperCaseLambda = a -> a.toLowerCase();
    static Function<String, String> toUpperCaseMethodReference = String::toLowerCase;

    static Function<Integer,Integer> hashCodeLambda= a-> a.intValue();
    static Function<Integer,Integer> hashCodeMethodReference= Integer::intValue;


    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("JSJ"));
        System.out.println(hashCodeLambda.apply(15));

    }
}
