package homework.hw2_WorkingwithText;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String cleanedSentence = sentence.replaceAll("\\s+", " ").trim();

        System.out.println("Sentence, where all consecutive spaces are replaced with a single space: " + cleanedSentence);

    }
}
