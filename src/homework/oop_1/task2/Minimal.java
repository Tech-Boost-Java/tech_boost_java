package homework.oop_1.task2;

// Write Java console application with method to find the smallest number among three integer numbers.
import java.util.Scanner;

public class Minimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Input the third number: ");
        int number3 = sc.nextInt();
        System.out.print("The smallest number is " + findMin(number1, number2, number3));
    }
    public static int findMin(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        else if (b < a && b < c) {
            return b;
        }
        else {
            return c;
        }
    }
}
