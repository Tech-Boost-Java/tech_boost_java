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

        int[] marks = new int [9];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter mark:");
            marks[i] = sc.nextInt();
            if(marks[i] < 0) {
                System.out.println("Mark out of range");
                break;
            }
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
