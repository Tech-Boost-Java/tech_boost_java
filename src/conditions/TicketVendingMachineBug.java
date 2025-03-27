package conditions;

import java.util.Scanner;

public class TicketVendingMachineBug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ticket type: ");
        String ticketType = scanner.nextLine().toLowerCase();

        int price = 0;

        switch (ticketType) {
            case "adult":
                price = 50;
            case "child":
                price = 25;

            case "student":
                price = 30;

            case "senior":
                price = 20;
                break;
            default:
                System.out.println("Invalid ticket type!");
                return;
        }

        System.out.println("Ticket price: " + price + " UAH");
    }
}
