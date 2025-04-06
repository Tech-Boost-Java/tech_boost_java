package Git_homework_2;

import java.util.Scanner;

public class FirstTask {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter sentence consisting of 5 words: ");
            String input = sc.nextLine().trim();
            String[] words = input.split("\\s+");

            if (words.length != 5) {
                System.out.println("You need to enter exactly 5 words.");
                return;
            }

            // Find the longest word
            String longestWord = "";
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            System.out.println("The longest word is " + longestWord + "; and its length is " + longestWord.length());

            // Reverse the second word, if available
            StringBuilder sb = new StringBuilder(words[1]);
            System.out.println("Reversed second word: " + sb.reverse());
        }
}
