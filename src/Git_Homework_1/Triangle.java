package Git_Homework_1;

import java.util.Scanner;

public class Triangle {
    static double calculateArea(double a, double b, double c) {
        if (!((a + b > c) && (a + c > b) && (b + c > a))){
            throw new ArithmeticException();
        }
        double area = (a + b + c) / 2;
        return Math.sqrt(area*(area-a)*(area-b)*(area-c));
    }


    public static void main(String[] args) {
        double[] sides = new double[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < sides.length; i++) {
            System.out.println("Enter Side " + (i + 1) + ": ");
            sides[i] = input.nextDouble();
        }

        System.out.println("The area of triangle is " + calculateArea(sides[0], sides[1], sides[2]));
    }
}

