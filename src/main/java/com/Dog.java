package com;

import java.util.Arrays;

/**
 * Created by: Marwan on 12/27/2021 around 4:48 PM
 */
public class Dog {
    String name;
    boolean hasFourLegs = true;
    boolean hasTwoEyes = true;

    public void barking() {
        System.out.println(name + " is barking");
    }

    public void running() {
        System.out.println(name + " is running");
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", hasFourLegs=" + hasFourLegs +
                ", hasTwoEyes=" + hasTwoEyes +
                '}';
    }
}

class Test {


    public static void main(String[] args) {
//        Dog d1 = new Dog("Jerry");
//        Dog d2 = new Dog("Ricky");
//        Dog d3 = new Dog("Pixie");
//
//
//        Dog[] dogs = {d1,d2,d3};
//
//
//
//        System.out.println(Arrays.toString(dogs));
//

//        d1.barking();
//        d2.running();

//        boolean isCitizen = true;
//        boolean greaterThan5 = 8 > 5;
//        String name = "my name is Mahdi";
//        int age = 9;
//        double salary = 150000.50;

        // you got a job that pays you 20 dollars per day. calculate how much you would be making per month?
//        int myDailyPay = 20;
//        int myMonthlyPay = myDailyPay * 30;
//        System.out.println("my monthly pay is: "+myMonthlyPay);

        // you are making 1200 us dollars per month, you are working 40 hors per week, calculate how much you are making per hour?
        double monthlyPay = 1200;
        double myWeeklyPay = monthlyPay / 4;
        double hourlyPay = myWeeklyPay / 40;
        System.out.println("my monthlyPay is = " + monthlyPay);
        System.out.println("my myWeeklyPay is = " + myWeeklyPay);
        System.out.println("my hourlyPay is = " + hourlyPay);

        // you have made 150000 USD last year. you ended up with only 80000 USD in your bank. how much did you spend? Ans: 70000 USD correct
        // for the last 3 years you were making 120000 USD per year, you didn't spend any penny, how much do you have by now? 360000 USD correct




    }
}
