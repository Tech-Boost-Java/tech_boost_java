package homework_String;

import java.util.Scanner;

public class FirstTask {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String sentence;
        System.out.print("Input the 5 words: ");

        sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String largestWord = words[0];
        for (int i = 0; i < 5; i++) {
            if (words[i].length() > largestWord.length()) {
                largestWord = words[i];
            }
        }

        System.out.println("Longest word is: " + largestWord);

        System.out.println("Number of letters in the longest word: " + largestWord.length());

        System.out.println("Second word: " + words[1]);

        scanner.close();
    }
}
