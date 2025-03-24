package hw;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = fahrenheitToCelsius(57.2);
        System.out.printf("57.2F = %.3fC%n", celsius); // 3 decimal places
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9);
    }
}
