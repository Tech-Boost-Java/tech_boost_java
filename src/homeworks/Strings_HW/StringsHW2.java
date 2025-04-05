package homeworks.Strings_HW;

import java.util.Scanner;

public class StringsHW2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the sentence");
        String input = scanner.nextLine();

        input = input.replaceAll("\\s+", " ");
        System.out.println("Your sentence without multiple spaces\n" + input);

        scanner.close();
    }
}
