package conditions;

import java.util.Scanner;

public class TicketMachine {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter ticket type: ");
        String ticketType = scan.nextLine().toLowerCase();

        System.out.println("Is it a weekend? (true/false)");
        boolean isWeekend = scan.nextBoolean();
        int basePrice = 0;
        int finalPrice = switch (ticketType) {
            case "adult" -> {
                basePrice = 15;
                if (isWeekend) {
                    basePrice += 5;
                }
                yield basePrice;
            }
            case "child" ->{
                basePrice = 10;
                if (isWeekend) {
                    basePrice += 2;
                }
                yield basePrice;
            }
            case "student" -> {
                basePrice = 15;
                if (isWeekend) {
                    basePrice += 1;
                }
                yield basePrice;
            }
            case "vip" -> {
                System.out.println("Special price for VIP");
                yield -1;
            }
            default -> {
                System.out.println("Invalid ticket type");
                yield -1;
            }
        };
        if (finalPrice != -1) {
            System.out.println("Final price: " + finalPrice);
        }
    }
}
