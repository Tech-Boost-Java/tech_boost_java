package Lesson3_tasks;

import java.util.Scanner;

public class PracticalTask1 {
    public static int getTotal(int a, int b) {
        return a + b;
    }

    public static double getAverage(int a, int b) {
        return (a+b)/2.0;
    }

    public static int getNumber(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextInt();
    }

    public static void main(String[] args) {
        int a = getNumber("Enter the first number: ");
        int b = getNumber("Enter the second number: ");
        System.out.println("The sum of " + a + " and " + b + " is: " + getTotal(a, b));
        System.out.println("The average of " + a + " and " + b + " is: " + getAverage(a, b));
    }
}
