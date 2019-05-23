import java.util.Scanner;

public class HelloApp {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println(age);
       */
        System.out.println("Enter a radius:");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.print("The area of a circle of radius " + radius + " is: " + area);

    }
}
