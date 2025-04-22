import java.util.Scanner;

public class string_homework1 {

    public static void analyzeWords(String[] words) {
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word is: " + longestWord);
        System.out.println("Amount of letters in this word is: " + longestWord.length());

        String reversedSecondWord = new StringBuilder(words[1]).reverse().toString();

        System.out.println("Reversed second word is: " + reversedSecondWord);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence of 5 words:");
        String sentence = input.nextLine();
        String[] words = sentence.split(" ");
        int MaxAmountOfWords = 5;

        if (words.length == MaxAmountOfWords) {
            analyzeWords(words);
        } else {
            System.out.println("Invalid sentence.");
        }
    }
}
