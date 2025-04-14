package homework_String;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Za-z]+(-[A-Za-z]+)*\\s[A-Za-z]+(-[A-Za-z]+)*$");

        String[] greetings = {
                "Hello, %s! Welcome aboard!",
                "Nice to meet you, %s!",
                "Greetings, %s! Have a great day!",
                "Hey %s, glad you're here!",
                "Welcome, %s! Let’s get started!"
        };

        String fullName;


        while (true) {
            System.out.print("Please enter your first and last name: ");
            fullName = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(fullName);

            if (matcher.matches())
                break;
            else
                System.out.println("Entered first or last name is not valid, try again!");
        }

        Random random = new Random();

        String greeting = greetings[random.nextInt(greetings.length)];

        System.out.printf(greeting, fullName);
        scanner.close();
    }
}
