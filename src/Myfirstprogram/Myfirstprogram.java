package Myfirstprogram;
import java.util.Scanner;

public class Myfirstprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello what is your name?");
        String name = sc.nextLine();
        System.out.println("What is your age?");
        int age = sc.nextInt();

        System.out.println("You are " + age + " years old" + "\nYour name is "+ name);
    }
}
