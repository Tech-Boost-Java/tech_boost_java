package Allhomework.second;

import java.util.regex.*;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter text in format $123.45: ");
        String textWithMoney = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(textWithMoney);
        System.out.println("Founded formats of values: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
