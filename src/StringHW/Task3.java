package StringHW;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter sentence");
        String input = scanner.nextLine();

        Pattern p = compile("\\$\\d+(\\.\\d{2})?");
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println( m.group());
        }

        scanner.close();
    }


}
