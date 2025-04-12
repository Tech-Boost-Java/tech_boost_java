package Git_Homework_1;

import java.util.Scanner;

public class SmallestNum {
    static int calculateSmallestNum (int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        }
        else if (b <= c && b <= a) {
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[3];
        String[] numOrder = { "first", "second", "third" };
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter " + numOrder[i] + " number: ");
            numbers[i] = input.nextInt();
        }

        System.out.println("The smallest number is " + calculateSmallestNum(numbers[0], numbers[1], numbers[2]));
    }
}
