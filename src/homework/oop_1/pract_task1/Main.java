package homework.oop_1.pract_task1;

// Write a Java console application with methods that accept two numbers as arguments and
// have the following names:
//      • getTotal - returns their sum;
//      • getAverage - returns their average;
//      • (*) static getNumber(String prompt) - allows input of numbers using Scanner with
// messages and return number.
// Call these methods from the main() method and print the results.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1 = getNumber("Enter the first number: ");
        int number2 = getNumber("Enter the second number: ");
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + getTotal(number1, number2));
        System.out.println("The average of " + number1 + " and " + number2 + " is " + getAverage(number1, number2));
    }
    static public int getTotal(int a, int b) {
        return a + b;
    }
    static public double getAverage(int a, int b) {
        return (a + b) / 2.0;
    }
    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
}
