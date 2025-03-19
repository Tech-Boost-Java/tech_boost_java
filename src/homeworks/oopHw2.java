package homeworks;

import java.util.Scanner;

public class oopHw2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input first number: ");
        int number1 = sc.nextInt();
        System.out.print("Input second number: ");
        int number2 = sc.nextInt();
        System.out.print("Input third number: ");
        int number3 = sc.nextInt();

        System.out.println("The smallest number is " + findSmallest(number1, number2, number3));
        sc.close();
    }

    static int findSmallest (int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            return firstNumber;
        }
        else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            return secondNumber;
        }
        else {
            return thirdNumber;
        }
    }
}
