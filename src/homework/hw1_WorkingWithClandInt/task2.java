package homework.hw1_WorkingWithClandInt;

import java.util.Scanner;

public class task2 {
    public static int findSmallest(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();

        int[] numbers = {num1, num2, num3};
        int smallest = findSmallest(numbers);

        System.out.println("The smallest number is " + smallest);

        scanner.close();
    }
}