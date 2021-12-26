package com.functionalInterfaces;

import java.util.*;
import java.util.function.Function;

/**
 * Created by: Marwan on 12/21/2021 around 6:44 PM
 */
public class FunctionExample {

    static Function<String, String> function = (name) -> name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());

    public static void main(String[] args) {

       // System.out.println(function.apply("MAJD"));

        List<String> fruits = List.of("apple","apple","apple","banana","banana","banana","banana","banana","banana","orange","orange","orange","orange");
        Map<String,Integer> map = new HashMap<>();
        for (String fruit : fruits) {
            map.put(fruit,Collections.frequency(fruits,fruit));
        }
        int maxValue = Collections.max(map.values());
        System.out.println();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(maxValue)){
                System.out.println(entry.getKey()+" is repeated "+entry.getValue()+" times");
            }
        }

    }
}
