package Allhomework.first;

import java.util.Scanner;

public class Homework1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Input Side 1: ");
        double sideA = scanner.nextDouble();

        System.out.print("Input Side 2: ");
        double sideB = scanner.nextDouble();

        System.out.print("Input Side 3: ");
        double sideC = scanner.nextDouble();

        double area = calculateTriangleArea(sideA, sideB, sideC);
        System.out.println("The area of the triangle is " + area);

        double smallest = findSmallestNumber(sideA , sideB, sideC);
        System.out.println("The smallest number is " + smallest);

        scanner.close();
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double findSmallestNumber(double a, double b, double c) {
        double smallest = a;
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }

}

