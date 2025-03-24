package hw;

import java.util.Scanner;

public class Triangle_area {
    public static void main(String[] args) {
        System.out.print("Input Side 1: ");
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        System.out.print("Input Side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Input Side 3: ");
        double side3 = sc.nextDouble();
        double semi_perimeter = (side1 + side2 + side3) / 2;
        System.out.println("Triangle Area = " + (Math.sqrt(semi_perimeter*(semi_perimeter-side1)*(semi_perimeter-side2)*(semi_perimeter-side3))));
        sc.close();
    }
}
