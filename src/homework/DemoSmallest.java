package homework;
import java.util.Scanner;

import static homework.SmallestNum.findSmallest;

public class DemoSmallest {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number:");
        int num3 = scanner.nextInt();
        System.out.print("The smallest number is " + SmallestNum.findSmallest(num1, num2, num3));

    }
}
