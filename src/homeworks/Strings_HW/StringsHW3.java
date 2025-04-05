package homeworks.Strings_HW;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsHW3 {
    static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input your sentence");
        String input = scaner.nextLine();

        Pattern p = Pattern.compile("\\$\\d+(\\.\\d{2})?");
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println("Found currency " + m.group());
        }

        scaner.close();
    }
}
