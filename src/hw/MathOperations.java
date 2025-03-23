package hw;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println("4^2 = " + calculateSquare(4));
        System.out.println("2^3 = " + calculateCube(2));
        System.out.println("16^0.5 = " + calculateSquareRoot(16));
    }
    public static double calculateSquare(double number) {
        return number*number;
    }
    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }
    public static double calculateCube(double number) {
        return number*number*number;
    }
}

