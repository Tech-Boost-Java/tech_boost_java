package StringHW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        String input;
        boolean t;
        do{
            System.out.println("Print sentence ");
            input=scanner.nextLine();
            t=input.matches("[a-zA-Z-]+ [a-zA-Z-]+");
        }while(!t);
        ArrayList<String> respond = new ArrayList<>();
        respond.add("Welcome, %s");
        respond.add("Welcome back, %s");
        respond.add("Hello, %s!");
        respond.add("Glad to see you, %s!");
        respond.add("Greetings, %s!");
        System.out.printf(respond.get(random.nextInt(5)),input);


    }
}
