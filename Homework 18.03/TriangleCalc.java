import java.util.Scanner;

public class TriangleCalc {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input Side 1: ");
            double a = sc.nextDouble();

            System.out.print("Input Side 2: ");
            double b = sc.nextDouble();
            
            System.out.print("Input Side 3: ");
            double c = sc.nextDouble();
            
            double hp = (a + b + c) / 2;
            
            if (a + b > c && a + c > b && b + c > a) {
                double area = Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));
                System.out.println("The area of the triangle is " + area);
            } else {
                System.out.println("The sides entered do not form a valid triangle.");
            }
        }
    }
}