package hw;
import java.util.Scanner;

public class SentenceAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence of 5 words: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());

        String secondWord = words[1];
        String reversed = new StringBuilder(secondWord).reverse().toString();
        System.out.println("Second word reversed: " + reversed);
    }
}
