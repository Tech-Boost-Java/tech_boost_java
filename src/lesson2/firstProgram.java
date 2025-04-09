package lesson2;

import java.util.Scanner;

public class firstProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.next();
        System.out.print("Enter your age please: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("\n");
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");

    }
}
