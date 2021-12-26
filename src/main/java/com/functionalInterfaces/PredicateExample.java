package com.functionalInterfaces;

import java.util.function.Predicate;

/**
 * Created by: Marwan on 12/20/2021 around 10:43 AM
 */
public class PredicateExample {

    static Predicate<Integer> isEven = a -> a % 2 == 0;
    static Predicate<Integer> greaterThan1LessThan100 = a -> a > 1 && a < 100;
    static Predicate<Integer> isPrimeNumber = a -> {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    };
    static Predicate<Integer> divisibleBy3 = a -> a % 3 == 0;
    static Predicate<Integer> divisibleBy3And9 = a -> a % 3 == 0 && a % 9 == 0;
    static Predicate<Integer> divisibleBy20 = a -> a % 20 == 0;

    static int num = 40;
    public static void predicateAnd() {
        System.out.println(isEven.and(greaterThan1LessThan100).and(divisibleBy20).and(divisibleBy3And9).test(num)); // predicate chaining
    }

    public static void predicateOr(){
        System.out.println(isEven.or(divisibleBy20).or(greaterThan1LessThan100).or(divisibleBy3And9).test(num)); // predicate chaining
    }

    public static void predicateNegate(){
        System.out.println(isEven.negate().test(num)); // negate will reverse the for opposite of what we are expecting
    }

    public static void main(String[] args) {


        // Objective to check whether a given number fall into those criteria specified above
        int num = 71;
        boolean checkNum = isPrimeNumber.and(isEven).and(greaterThan1LessThan100).and(divisibleBy3).and(divisibleBy3And9).test(num);
        System.out.println(checkNum);
        System.out.println("Is " + num + " a prime number? : " + isPrimeNumber.test(num));
        System.out.println("***********************");
        predicateAnd();
        predicateOr();
        predicateNegate();


    }


}
