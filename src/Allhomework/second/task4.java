package Allhomework.second;

import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your full name:");
        String namePattern = "^[A-Za-z\\s-]+$";
        String fullName;
        while (true) {
            fullName = scanner.nextLine();
            if (fullName.matches(namePattern)) {
                break;
            } else {
                System.out.println("error in name pattern:");
            }
        }

        String[] greetings = {
                "Hello, %s! Nice to meet you.!",
                "Hi, %s! Well day to you!",
                "Great day, %s!You still keep studying this code (\"_\")?Ok,get a joke,Why did the developer become so poor?... Because he cleared his cache",
                "Hey, %s! It was nice to meet you after a long time!"
        }; // sorry for that I'm just going crazy after a long day...
        String greeting = greetings[new Random().nextInt(greetings.length)];
        System.out.printf(greeting + "%n", fullName);
    }
}