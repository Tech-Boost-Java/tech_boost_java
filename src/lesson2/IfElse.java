package lesson2;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int x = sc.nextInt();
        sc.nextLine();
        if (x < 12) {
            System.out.println("Failed");
        } else {
            System.out.println("Passed");
        }

        int a = 37;
        int b = 24;
        if (a > 50 && (b = 72) < 50) {
            System.out.println("1) Do something...");
        }
        System.out.println("Variable 'a' = " + a);
        System.out.println("Variable 'b' = " + b);

        if (a > 50 & (b = 72) < 50) {
            System.out.println("2) Do something...");
        }
        System.out.println("Variable 'a' = " + a);
        System.out.println("Variable 'b' = " + b);

        int r = (a > b) ? 1 : 0;
        System.out.println("Variable 'r' = " + r);

        boolean sw = true;

        switch (x) {
            case 0:
                System.out.println("00");
                break;
            case 1:
                System.out.println("11");
                break;
            default:
                System.out.println("999");
                break;
        }

        System.out.println("Do you enjoy Java? (yes/no/maybe)");
        String input = sc.nextLine();
        String result;
        switch (input.toLowerCase()) {
            case "yes":
            case "maybe":
                result = "Great!";
                break;
            case "no":
                result = "Too bad!";
                break;
            default:
                result = "Wrong!";
        }
        System.out.println(result);

        System.out.println("Do you enjoy Java? (yes/no/maybe)");
        String input2 = sc.nextLine();
        String result2 = switch (input2.toLowerCase()) {
            case "yes", "maybe" -> "Great!";
            case "no" -> "Too bad!";
            default -> "Wrong!";
        };
        System.out.println(result2);

    }
}
