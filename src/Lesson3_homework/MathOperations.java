package Lesson3_homework;

import java.util.Scanner;

public class MathOperations {
    public static double getNumber(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextDouble();
    }
    public static double getTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double getSmallestNumber(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }

    public static void main(String[] args) {
        double a = getNumber("Enter the first number: ");
        double b = getNumber("Enter the second number: ");
        double c = getNumber("Enter the third number: ");
        System.out.println("The smallest number is: " + MathOperations.getSmallestNumber(a, b, c));
        System.out.println("The area of the triangle is: " + MathOperations.getTriangleArea(a, b, c));
    }
}
