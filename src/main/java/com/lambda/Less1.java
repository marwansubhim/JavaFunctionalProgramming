package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by: Marwan on 12/18/2021 around 8:10 PM
 */
public class Less1 {
    public static void main(String[] args) {

        VoidWithTwoParams addTwoParams = (a, b) -> System.out.println("Addition is " + (a + b));
        VoidWithTwoParams subtractTwoParams = (a, b) -> System.out.println("Subtraction is " + (a - b));
        VoidWithTwoParams multiplyTwoParams = (a, b) -> System.out.println("Multiplication is " + (a * b));
        VoidWithTwoParams areTheyEqual = (a, b) -> System.out.println("Are they equal? " + a.equals(b));

        addTwoParams.twoParamsOps(5, 6);
        subtractTwoParams.twoParamsOps(7, 5);
        multiplyTwoParams.twoParamsOps(5, 6);
        areTheyEqual.twoParamsOps(40, 6);

        /***********************************************************************/

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(list);
        for (int i = 0, j = list.size() - 1; i < list.size(); i++) {
            list.add(i, list.remove(j));
        }
        System.out.println(list);
        ReturnListFromOneList reversList = a -> {
            for (int i = 0, j = a.size() - 1; i < a.size(); i++) {
                a.add(i, a.remove(j));
            }
            return a;
        };
        System.out.println(reversList.performOps(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))));
        ReturnListFromOneList getEvenNumberFromList = a -> {
            for (int i = 0; i <= a.size() - 1; i++) {
                if (a.get(i) % 2 == 1) a.remove(a.get(i));
            }
            return a;
        };
        System.out.println(getEvenNumberFromList.performOps(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))));
        ReturnListFromOneList getOddNumberFromList = a -> {
            for (int i = 0; i <= a.size() - 1; i++) {
                if (a.get(i) % 2 == 0) a.remove(a.get(i));
            }
            return a;
        };
        System.out.println(getOddNumberFromList.performOps(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))));
        System.out.println("*******************************************");


    }
}


@FunctionalInterface
interface VoidWithTwoParams {
    void twoParamsOps(Integer a, Integer b);
}

@FunctionalInterface
interface ReturnListFromOneList {
    List<Integer> performOps(List<Integer> integerList);
}





