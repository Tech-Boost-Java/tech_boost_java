import java.util.Scanner;

class TriangleAreaCalculator {

    public static double calculateArea(double a, double b, double c) {

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first side a of the triangle: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second side b of the triangle: ");
        double b = scanner.nextDouble();

        System.out.print("Enter third side c of the triangle: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            double area = calculateArea(a, b, c);
            System.out.println("The area " + area);
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
}
