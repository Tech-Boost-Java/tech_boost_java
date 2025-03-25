package hw_1;

import java.util.Scanner;

public class TriangleArea {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input side 1: ");
        int side1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input side 2: ");
        int side2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input side 3: ");
        int side3 = scanner.nextInt();
        scanner.nextLine();
        double p = (double)(side1 + side2 + side3) / 2;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        System.out.println("The area of the triangle is: " + Math.round(area * 100.0) / 100.0);
    }
}
