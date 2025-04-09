package lesson2;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int x = sc.nextInt();
        sc.nextLine();
        String y = sc.nextLine();
        System.out.println(x + y);
    }
}
