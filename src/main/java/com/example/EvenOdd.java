
package com.example;

public class EvenOdd {

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number = 7;

        if (args.length > 0) {
            number = Integer.parseInt(args[0]);
        }

        System.out.println(number + " is " + checkEvenOdd(number));
    }
}
