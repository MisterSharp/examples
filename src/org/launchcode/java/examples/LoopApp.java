package org.launchcode.java.examples;

import java.util.Scanner;

public class LoopApp {

    public static void main(String[] args) {
        //for loop requires for (initialization, condition, stop)
       /*
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        */

        //while loop example


        Scanner sc = new Scanner(System.in);  /*
        String response = "";
        while (!response.equals("y") && !response.equals("n")) {
            System.out.print("Do you accept [y/n]: ");
            response = sc.next();
            if (!response.equals("y") && !response.equals("n")) {
                System.out.println("You must answer y or n");
            }
        }
        */
        //do while loop

        String response;
        do {
            System.out.print("Do you accept [y/n]: ");
            response = sc.next();
            if (!response.equals("y") && !response.equals("n")) {
                System.out.println("You must answer y or n");
            }
        } while (!response.equals("y") && !response.equals("n")) ;
        System.out.println("Thank you");

        }








    }


