package com.lambda;

/**
 * Created by: Marwan on 12/19/2021 around 10:19 PM
 */
public class RunnableLambda {

    public static void main(String[] args) {
        Runnable runnable1 = ()-> System.out.println("Hello world"); // declarative way
        runnable1.run();

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        }; // imperative legacy way with anonymous method
        runnable2.run();




    }
}
