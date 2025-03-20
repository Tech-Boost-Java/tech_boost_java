package hw;

public class DigitsSum {
    public static void main(String[] args) {
        System.out.println(calculateDigitSum(123));
    }
    public static int calculateDigitSum(int number) {
        int sum = 0;
        if (number < 100 || number > 999) {
            throw new IllegalArgumentException("The input number is not a three-digit number.");
        }
        while (number > 0) {
            int part = number % 10;
            sum += part;
            number /= 10;
        }
        return sum;
    }
}
