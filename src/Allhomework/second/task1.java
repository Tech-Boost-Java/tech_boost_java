package Allhomework.second;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence from 5 words:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        if (words.length != 5) {
            System.out.println("Error: words length does not match.You should enter 5 words instead of " + words.length);
            return;
        }
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        String secondWordReversed = new StringBuilder(words[1]).reverse().toString();
        System.out.println("The longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWord.length());
        System.out.println("Second word of the sentence in reverse order: " + secondWordReversed);
    }
}

