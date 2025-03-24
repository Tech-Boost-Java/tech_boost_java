package HomeTasks;

import java.util.Scanner;

public class Task2 {
    public static int smallestNumber(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        System.out.println("The smallest number is: " + smallestNumber(a, b, c));
    }
}
