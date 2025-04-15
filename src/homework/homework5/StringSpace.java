package homework.homework5;

import java.util.Scanner;

public class StringSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(s.replaceAll("\\s+", " "));
    }
}
