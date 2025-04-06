package Git_homework_2;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence with multiple spaces: ");
        String input = sc.nextLine();
        String result = input.replaceAll("\\s+", " ").trim();
        System.out.print("Normalized string: " + result);
    }
}
