package homework_oop;

import java.util.Scanner;

public class AreaTringCalc {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Input side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Input side 3: ");
        int side3 = scanner.nextInt();
        double area = AreaTringCalc.calculateAreaOfTriangle(side1, side2, side3);
        if (area != -1)
            System.out.println("Area of triangle: " + String.format("%.2f", area));

        scanner.close();
    }

    static double calculateAreaOfTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("The entered side cannot be sides of a triangle!");
            return -1;
        }
        double halfPerimeter = (double) (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
