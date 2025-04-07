package homework.hw2_WorkingwithText;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {

    public static void findCorrectFormat(String sentence) {
        String regex = "\\$\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        System.out.println("Знайдені суми у форматі $xx.xx:");

        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("Суми у форматі $xx.xx не знайдено.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text containing several instances of US currency format: ");
        String sentence = scanner.nextLine();
        scanner.close();

        findCorrectFormat(sentence);
    }
}
