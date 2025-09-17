package Part1;

import java.util.Scanner;

public class Inputs {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Write a string");
        // String valueString = scanner.nextLine();
        // System.out.println("String: " + valueString);
        
        // System.out.println("Write a double");
        // double valueDouble = Double.valueOf(scanner.nextLine());
        // System.out.println("Double: " + valueDouble);

        // System.out.println("Write an int");
        // int valueInt = Integer.valueOf(scanner.nextLine());
        // System.out.println("int: " + valueInt);

        // System.out.println("Write a bool");
        // boolean valueBoolean = Boolean.valueOf(scanner.nextLine());
        // System.out.println("Boolean: " + valueBoolean);





        // System.out.println("How many days do you want to convert to seconds?");
        // int days = Integer.valueOf(scanner.nextLine());
        // int sum = days * 24 * 60 * 60;
        // System.out.println("In " + days + " days there are " + sum + " seconds.");


        System.out.println("How fast were you going?");
        int speed = Integer.valueOf(scanner.nextLine());
        if (speed > 120) {
            System.out.println("here's a speeding ticket");
        } else {
            System.out.println("You're free to go");
        }


        scanner.close();
    }
}