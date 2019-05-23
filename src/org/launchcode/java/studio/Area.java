package org.launchcode.java.studio;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        System.out.println("Enter a radius:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Echo " + sc.nextDouble());
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        //System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
