package HomeTasks;

import java.util.Scanner;

// Triangle
public class Task1 {
    public static double triangleArea(int side1, int side2, int side3) {
        if (!isValidTriangle(side1, side2, side3)) {
            System.out.println("Invalid triangle sides!");
            return -1; // Indicating an error
        }

        int s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Side 1: ");
        int side1 = sc.nextInt();
        System.out.print("Input Side 2: ");
        int side2 = sc.nextInt();
        System.out.print("Input Side 3: ");
        int side3 = sc.nextInt();

        double area = triangleArea(side1, side2, side3);

        if (area != -1) {
            System.out.println("Triangle Area: " + area);
        }

        sc.close();
    }
}
