import java.util.Scanner;

class FindSmallestNumber {

    public static double finder(double a, double b, double c) {
        double smallest = a;

        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double c = scanner.nextDouble();

        // Виклик методу finder
        double smallest = finder(a, b, c);

        // Виведення результату
        System.out.println("The smallest number = " + smallest);

        scanner.close();
    }
}
