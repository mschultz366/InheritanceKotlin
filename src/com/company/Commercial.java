package com.company;
import java.util.Scanner;

public class Commercial extends Customer {
    public static void getInfo() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Property name: ");
        String propertyName = scan.nextLine();

        System.out.print("Customer name: ");
        customerName = scan.nextLine();

        System.out.print("Customer phone number: ");
        customerPhone = scan.nextLine();

        System.out.print("Customer address: ");
        customerAddress = scan.nextLine();

        System.out.print("Square footage: ");
        squareFootage = scan.nextInt();

        System.out.print("Multi-property discount? (true or false): ");
        boolean multi = scan.nextBoolean();
        double weeklyRate = 5; // per 1000 feet

        double totalWeeklyCharges = (weeklyRate * squareFootage);

        if(multi){
            System.out.println("\n\nYou are receiving a multi-property discount.");
            System.out.println(propertyName);
            System.out.println(customerName);
            System.out.println(customerAddress);
            System.out.println(customerPhone);
            System.out.println(squareFootage);
            System.out.println("Your charges are $" + String.format("%.2f", totalWeeklyCharges * .9));
            System.out.print("\n");

        }
        else {
            System.out.println("You are receiving no discount.");
            System.out.println(propertyName);
            System.out.println(customerName);
            System.out.println(customerAddress);
            System.out.println(customerPhone);
            System.out.println(squareFootage);
            System.out.println("Your charges are $" + String.format("%.2f", totalWeeklyCharges));
            System.out.print("\n");

        }

    }
}
