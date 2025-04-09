package QuizeTasks;
import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three0digit number: ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        System.out.println(calculateDigitSum(number));

    }
    public static int calculateDigitSum(int number) {
        if (number >= 100 && number <= 999) {
            int dogit1 = number%10;
            int digit2=(number/10)%10;
            int digit3 = number/100;
            int result = dogit1+digit2+digit3;
            return  result;


        } else {
            // Handle the error if the number is not three digits
            throw new IllegalArgumentException("The input number is not a three-digit number.");
        }

    }
}

