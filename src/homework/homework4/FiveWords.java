package homework.homework4;

import java.util.Scanner;

public class FiveWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enput five words: ");
        String word = sc.nextLine();
        String[] words = word.split("\\s+");

        String theLongestWord = words[0];
        for(String word1 : words){
            if (word1.length() > theLongestWord.length()){
                theLongestWord = word1;
            }
        }
        System.out.println("The longest word: " + theLongestWord + " (length: " + theLongestWord.length() + ")");
        System.out.println("The second word of the sentence in reverse order: " + words[words.length - 2]);

    }
}
