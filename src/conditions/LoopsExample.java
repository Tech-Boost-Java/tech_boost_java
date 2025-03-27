package conditions;

import java.util.Scanner;

public class LoopsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
          System.out.println("Value of i is: " + i);
            System.out.println(i + " * 2 = " + (i * 2));
        }

        System.out.println("*".repeat(10));
        int[] numbers = {10, 20, 30, 40, 50, 70};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Value of element " + i + " is: " + numbers[i]);
        }
        //for-each loop
        System.out.println("*".repeat(10));
        for (int number : numbers) {
            System.out.println("Value of element is: " + number);
        }
        System.out.println("*".repeat(10));

        int a = 0;
        while (a < 10) {
            System.out.println("Value of a is: " + a);
            a += 2;
        }
        Scanner scan = new Scanner(System.in);
        String input = "";
        while (!input.equalsIgnoreCase("exit")) {
            System.out.println("Enter a word or 'exit' to quit: ");
            input = scan.nextLine();
            System.out.println("You entered: " + input);
        }

        char choice;

        do {
            System.out.println("Let's play a game! ");
            System.out.println("Do you want to play again? (y/n)");
            choice = scan.next().charAt(0);
        } while (choice == 'y');
        scan.close();
    }
}
