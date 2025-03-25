package homework;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Test1");

        Tringlses triangle = new Tringlses(); 

        System.out.println("Input a side #1:");
        triangle.setSide1(scanner.nextInt());

        System.out.println("Input a side #2: ");
        triangle.setSide2(scanner.nextInt());

        System.out.println("Input a side #3: ");
        triangle.setSide3(scanner.nextInt());

        double squareTriangle = triangle.findSquare();
        System.out.println("Square = " + squareTriangle);

        scanner.close();
    }
}
