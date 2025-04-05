package homeworks.Strings_HW;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsHW1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean valid;
        String input;

        do {
            System.out.println("Input sentence that contains five words");
            input = scanner.nextLine();

            valid = input.trim().matches("([a-zA-Z]+\\s){4}[a-zA-Z]+");
        } while (!valid);

            String[] words = input.split("\\s+");

            int longestWordLength = words[0].length();
            int longestWordIndex = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > longestWordLength) {
                 longestWordLength = words[i].length();
                 longestWordIndex = i;
                }
            }
            System.out.println("The longest word: " + words[longestWordIndex] + "\nThe number of letters is: " + longestWordLength);

            StringBuilder reversedSecondWord = new StringBuilder(words[1]).reverse();
            System.out.println("The second word in reversed order: " + reversedSecondWord);

            scanner.close();
    }
}
