package Homework_strings;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean operation_success = false;
        while (!operation_success) {
            System.out.println("Enter first name: ");
            String firstName = scanner.nextLine();
            if (firstName.matches("[a-zA-Z]+")) {
                System.out.println("Enter last name: ");
                String lastName = scanner.nextLine();
                if (lastName.matches("[a-zA-Z]+")) {
                    System.out.println("Hello " + firstName + " " + lastName + "!");
                    operation_success = true;
                }
            }

            if (!operation_success) {
                System.out.println("Invalid input! ");
            }
        }
        scanner.close();
    }
}
