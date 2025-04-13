package hw;

import java.util.Scanner;
import java.util.regex.*;
import java.util.Random;

public class UserGreeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namePattern = "^[A-Za-z\\s-]+$";
        Pattern pattern = Pattern.compile(namePattern);

        String firstName, lastName;

        while (true) {
            System.out.print("Enter your first name: ");
            firstName = sc.nextLine();
            Matcher m = pattern.matcher(firstName);
            if (m.matches()) break;
            System.out.println("Invalid first name! Try again.");
        }

        while (true) {
            System.out.print("Enter your last name: ");
            lastName = sc.nextLine();
            Matcher m = pattern.matcher(lastName);
            if (m.matches()) break;
            System.out.println("Invalid last name! Try again.");
        }

        String[] greetings = {
                "Nice to meet you, %s %s",
                "Welcome aboard, %s %s",
                "Hello there, %s %s",
                "Greetings, %s %s"
        };

        Random rand = new Random();
        int index = rand.nextInt(greetings.length);
        System.out.printf(greetings[index], firstName, lastName);
    }
}
