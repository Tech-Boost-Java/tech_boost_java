package homework.hw2_WorkingwithText;

import java.util.Scanner;

public class task1 {

    public static String findLongestWord(String[] words) {
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence (5 words): ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        scanner.close();

        if (words.length != 5) {
            System.out.println("Error. Sentence contains incorrect number of words!");
            return;
        }

        String longestWord = findLongestWord(words);
        System.out.println("The longest word: " + longestWord);
        System.out.println("The number of letters in it: " + longestWord.length());

        String secondWordReversed = new StringBuilder(words[1]).reverse().toString();
        System.out.println("Second word reversed: " + secondWordReversed);
    }

}
