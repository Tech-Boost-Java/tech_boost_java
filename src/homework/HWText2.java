package homework;

import java.util.Scanner;

public class HWText2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String normalized = sentence.replaceAll("\\s+", " ");
        System.out.println("Result after normalizing: " + normalized);
    }
}
