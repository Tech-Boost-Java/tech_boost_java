package homework.homework7;

import java.util.Random;
import java.util.Scanner;

public class UserValidating {
    public static void main(String[] args) {
        String pattern = "^[A-Za-z\\-\\s]+$";
        Scanner sc = new Scanner(System.in);
        String firstName, lastName;
        String[] messages = {
                "Hello, %s %s!",
                "Nice to meet you, %s %s!",
                "Greetings, %s %s! Have a wonderful day."
        };

        while(true) {
            System.out.println("Enter your first name: ");
            firstName = sc.nextLine();
            if(firstName.matches(pattern)) {
                break;
            } else {
                System.out.println("Error");
            }
        }

        while(true) {
            System.out.println("Enter your last name name: ");
            lastName = sc.nextLine();
            if(lastName.matches(pattern)) {
                break;
            } else {
                System.out.println("Error");
            }
        }

        Random r = new Random();
        int i = r.nextInt(messages.length);
        System.out.printf(messages[i], firstName, lastName);
    }
}
