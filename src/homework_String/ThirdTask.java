package homework_String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdTask {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Pattern dolarPattern = Pattern.compile("\\$[0-9]+(\\.[0-9]{2})");

        System.out.print("Enter the sentence: ");

        String sentence = scanner.nextLine();

        Matcher matcher = dolarPattern.matcher(sentence);

        System.out.print("US currency values found: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

        scanner.close();
    }
}
