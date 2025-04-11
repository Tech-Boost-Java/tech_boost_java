package Homework_strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceAnalyzer {
    public static void main(String[] args) {
        System.out.println("Enter a inputText with five words: ");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        String[] words = inputText.split("\\s+");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println(longestWord);
        System.out.println("Number of letters: " + longestWord.length());

        String reversedSecondWord = new StringBuilder(words[1]).reverse().toString();
        System.out.println("Reversed second word: " + reversedSecondWord);

        String normalized = inputText.replaceAll("\\s+", " ");
        System.out.println("Normalized inputText: " + normalized);

        String currencyPattern = "\\$\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(currencyPattern);

        Matcher matcher = pattern.matcher(inputText);

        System.out.println("\nFound US currency amounts:");
        boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No US currency amounts found in the text.");
        }

        scanner.close();
    }
}
