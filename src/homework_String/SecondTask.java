package homework_String;

import java.util.Scanner;

public class SecondTask {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Eneter the sentence whit repeating space: ");
        String sentence = scanner.nextLine();
        sentence = sentence.replaceAll("\\s+", " ");

        System.out.println("Sentences without repeating spaces: " + sentence);

        scanner.close();
    }
}
