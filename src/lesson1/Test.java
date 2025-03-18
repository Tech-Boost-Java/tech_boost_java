package lesson1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        System.out.println("Square of number: " + (number * number));
    }
}


