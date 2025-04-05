package homeworks.OOP_HW;

import java.util.Scanner;

import static java.lang.Math.*;

public class oopHw1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input side 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Input side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Input side 3: ");
        double side3 = sc.nextDouble();

        Triangle t = new Triangle(side1, side2, side3);
        System.out.println("The area of the triangle is " + round(t.findSquare() * 1000.0) / 1000.0);

        sc.close();
    }
}

class Triangle {
    private double  side1, side2, side3;

    public Triangle () {

    }

    public Triangle (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double findSquare () {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }
}
