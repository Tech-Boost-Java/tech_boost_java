package StringHW;

import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        System.out.println("Print 5 word sentence ");
        input=scanner.nextLine();
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

        StringBuilder reversedWord = new StringBuilder(words[1]).reverse();
        System.out.println("The second word in reversed order: " + reversedWord);


    }
}
