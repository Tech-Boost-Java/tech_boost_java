package homework_pres;
import java.util.Scanner;

public class DemoTriangle {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Triangle triangle = new Triangle();
    int[] sides = new int[3];
    System.out.print("Input side 1: ");
    int side1 = scanner.nextInt();
    triangle.setSide1(side1);
    System.out.print("Input side 2: ");
    int side2 = scanner.nextInt();
    triangle.setSide2(side2);
    System.out.print("Input side 3: ");
    int side3 = scanner.nextInt();
    triangle.setSide3(side3);
    System.out.print("Area of triangle is: " + triangle.calculateArea());
    
  }
}
