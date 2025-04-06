package Git_homework_2;

import java.util.Scanner;
import java.util.regex.*;

public class ConsoleApp {
    public static void main(String[] args) {
        String[] greetings = {"Welcome ", "Hi ", "Hello ", "Good morning ", "Good afternoon ", "Good evening ", "Good night "};

        // Final refined regex
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+(?:[-'][A-Z]?[a-z]+)?\\s[A-Z][a-z]+(?:[-'][A-Z]?[a-z]+)?$");

        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.println("Enter your full name (e.g., John Smith or Mary-Jane O'Connor):");
            input = sc.nextLine().trim();
        } while (!pattern.matcher(input).matches());

        int randint = (int) (Math.random() * greetings.length);
        System.out.println(greetings[randint] + input);
    }
}

