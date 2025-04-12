package practice.practice1;
import java.util.Scanner;

public class Main {
    public double getTotal(double a, double b) {
        return a + b;
    }

    public double getAverage(double a, double b) {
        return (a + b) / 2;
    }

    public static double getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        double a = getNumber("Enter a");
        double b = getNumber("Enter b");
        Main main = new Main();
        System.out.println(main.getTotal(a, b));
        System.out.println(main.getAverage(a, b));
    }
}
