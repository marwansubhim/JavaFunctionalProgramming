package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by: Marwan on 12/19/2021 around 9:21 PM
 */
public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 3, 2, 1, 4));

        /**
         * Imperative approach
         */
        List<Integer> uniqueList1 = new ArrayList<>();
        for (Integer each : integerList) {
            if (!uniqueList1.contains(each)) uniqueList1.add(each);
        }
        System.out.println("uniqueList with imperative approach = " + uniqueList1);

        /**
         * Declarative approach
         */

        List<Integer> uniqueList2 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("uniqueList with declarative approach = "+uniqueList2);


    }
}
