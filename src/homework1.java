import java.util.Scanner;

public class homework1 {

    static double calcTriangleArea(double side1, double side2, double side3) {
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
                double p = (side1 + side2 + side3) / 2;
                return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
            } else {
                System.out.println("Such a triangle does not exist!");
                return 0;
            }
        } else {
            System.out.println("Sides can be only positive!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are trying to calculate the triangle area!");
        double[] sides;
        sides = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + (i + 1) + " side: ");
            sides[i] = sc.nextDouble();
        }
        System.out.println("The area of this triangle: " + calcTriangleArea(sides[0], sides[1], sides[2]));
    }
}
