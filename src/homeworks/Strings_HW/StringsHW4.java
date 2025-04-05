package homeworks.Strings_HW;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StringsHW4 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        boolean valid;
        String input;

        do {
            System.out.println("Enter your first and last name");
            input = scanner.nextLine();

            valid = input.matches("[a-zA-Z-]+ [a-zA-Z-]+");
        } while (!valid);

        ArrayList<String> phases = new ArrayList<>();
        phases.add("Welcome, %s");
        phases.add("Hi, %s");
        phases.add("Hello, %s!");
        phases.add("Nice to meet you, %s!");
        phases.add("Greetings, %s!");

        System.out.printf(phases.get(random.nextInt(5)), input);

        scanner.close();
    }
}
