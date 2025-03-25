package hw_1;

import java.util.Scanner;

public class SmallestNumber {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int first = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input the second number: ");
        int second = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input the third number: ");
        int third = scanner.nextInt();
        scanner.nextLine();

        int smallestNumber;
        if (first < second && first < third) {
            smallestNumber = first;
        } else if (second < first && second < third) {
            smallestNumber = second;
        } else {
            smallestNumber = third;
        }

        System.out.println("The smallest number is " + smallestNumber);
    }
}
