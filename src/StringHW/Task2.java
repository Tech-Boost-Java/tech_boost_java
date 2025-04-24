package StringHW;

import java.util.Scanner;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        System.out.println("Print sentence ");
        input=scanner.nextLine();
        input=input.replaceAll("\\s+"," ");
        System.out.println(input);

    }
}
