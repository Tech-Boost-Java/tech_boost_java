package homework.oop_1.task1;

// Write Java console application with method to calculate the area of a triangle
import java.util.Scanner;
import java.lang.Math;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side 1: ");
        int a = sc.nextInt();
        System.out.print("Input side 2: ");
        int b = sc.nextInt();
        System.out.print("Input side 3: ");
        int c = sc.nextInt();
        System.out.print("The area of the triangle is " + calculateArea(a, b, c));
    }
    public static double calculateArea(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
