package lesson1;

import java.util.Scanner;

public class ScannerExample {
    // Create a Scanner object to read input from the console
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Reading an integer (int)
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // Reads an integer value
        System.out.println("You entered integer: " + number);

        // Reading a double
        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble(); // Reads a double value
        System.out.println("You entered decimal: " + decimal);

        // Reading a float
        System.out.print("Enter a float number: ");
        float floatNum = scanner.nextFloat(); // Reads a float value
        System.out.println("You entered float: " + floatNum);

        // Reading a single word (String)
        System.out.print("Enter a single word: ");
        String word = scanner.next(); // Reads the next word (stops at whitespace)
        System.out.println("You entered word: " + word);

        // Clear the buffer before reading a full line
        scanner.nextLine(); // Consumes the leftover newline character

        // Reading a full line (String)
        System.out.print("Enter a full sentence: ");
        String sentence = scanner.nextLine(); // Reads an entire line of text
        System.out.println("You entered sentence: " + sentence);

        // Reading a character
        System.out.print("Enter a single character: ");
        char letter = scanner.next().charAt(0); // Reads first character of input
        System.out.println("You entered character: " + letter);

        // Reading a boolean
        System.out.print("Enter true or false: ");
        boolean truth = scanner.nextBoolean(); // Reads a boolean value
        System.out.println("You entered boolean: " + truth);
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
