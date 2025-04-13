package hw;
import java.util.Scanner;

public class WhitespaceCleaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence with extra spaces: ");
        String sentence = sc.nextLine();

        String result = sentence.replaceAll("\\s+", " ").trim();
        System.out.println("Cleaned sentence:");
        System.out.println(result);
    }
}
