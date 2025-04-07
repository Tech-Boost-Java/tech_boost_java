package homework.hw1_WorkingWithClandInt;

import java.util.Scanner;

public class task1 {
    //Geron's formula
    public static double calculateArea(double side1, double side2, double side3) {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input Side 3: ");
        double side3 = scanner.nextDouble();

        scanner.close();

        double triangleArea = calculateArea(side1, side2, side3);

        System.out.println("The area of the triangle is " + triangleArea);
    }
}