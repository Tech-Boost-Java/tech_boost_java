package homework_oop;

import java.util.Scanner;

public class SmallestNum {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int a = scanner.nextInt();
        System.out.print("Input the second number: ");
        int b = scanner.nextInt();
        System.out.print("Input the third number: ");
        int c = scanner.nextInt();

        int minValue = SmallestNum.findSmallest(a, b, c);
        System.out.println("The smallest number is " + minValue);

        scanner.close();
    }

    static int findSmallest(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        else if (b <= a && b <= c) return b;
        else return c;
    }
}
