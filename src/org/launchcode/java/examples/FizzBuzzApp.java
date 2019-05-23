package org.launchcode.java.examples;

public class FizzBuzzApp {

    public static String fizzBuzz(int m) {
        if (m % 15 == 0){
            return "FizzBuzz";
        } else if (m % 5 == 0){
            return "Buzz";
        } else if (m % 3 == 0){
            return "Fizz";
        } else {
            return Integer.toString(m);
        }
    }


    public static void main(String[] args) {

        System.out.println(fizzBuzz(325));
    }

}
