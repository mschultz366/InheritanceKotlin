package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {

            System.out.println("1. Commercial");
            System.out.println("2. Residential");
            System.out.println("3. Done");
            System.out.println("Enter (1-3) to make your choice.\n");


            choice = scan.nextInt();

            switch(choice) {

                case 1: Commercial.getInfo();
                    break;

                case 2: Residential.getInfo();
                    break;

                case 3: System.out.println("Exiting...\n");
                    break;

                default: System.out.println("Something isn't right here....");
                    break;
            }

        }
    }
}
