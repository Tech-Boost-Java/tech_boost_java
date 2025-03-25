package homework;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Hello, Test2");
        Scanner scanner = new Scanner(System.in);

        Number_2 number = new Number_2();

        System.out.println("Input a number #1:");
        number.setNumber1(scanner.nextInt());

        System.out.println("Input a number #2:");
        number.setNumber2(scanner.nextInt());

        System.out.println("Input a number #3:");
        number.setNumber3(scanner.nextInt());

        double min = number.compare(number.getNumber1(), number.getNumber2(), number.getNumber3());
        System.out.println("Min value = " + min);

    }
}
