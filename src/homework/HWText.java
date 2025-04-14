package homework;
import java.util.Scanner;


public class HWText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence with five words:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        String word2 = new StringBuilder(words[1]).reverse().toString();
        System.out.println("longestWord is " +longestWord);
        System.out.println("long of longestWord is " + longestWord.length());
        System.out.println("Reversed word 2: " +word2);
    }
}
