package Practicals.Practical1;

import java.util.Scanner;

import static java.lang.Math.*;

public class MathOperations {
    public static double calculateSquareRoot(double num) {
        return (double) sqrt(num);
    }

    public static double calculateSquare(double num) {
        return (double) pow(num, 2);
    }

    public static double calculateCube(double num) {
        return (double) pow(num, 3);
    }



public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double number = sc.nextDouble();
    double sum = calculateCube(number);
    System.out.println(sum);
    sc.close();
}
}
