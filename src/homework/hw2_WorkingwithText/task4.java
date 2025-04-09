import java.util.Scanner;
import java.util.Random;

public class task4 {
    public static boolean isValidName(String name) {
        return name.matches("[A-Za-z\\s-]+");
    }

    public static String getUserName(Scanner scanner, String type) {
        String name;
        while (true) {
            System.out.print("Enter your " + type + ": ");
            name = scanner.nextLine().trim();
            if (isValidName(name)) {
                break;
            } else {
                System.out.println("Invalid input! Please use only English letters, spaces, and hyphens.");
            }
        }
        return name;
    }

    public static void generateRandomGreeting(String firstName, String lastName) {
        // Масив можливих привітань
        String[] greetings = {"Hello, %s %s!", "Welcome, %s %s!", "Nice to meet you, %s %s!", "Good to see you, %s %s!", "Greetings, %s %s!"};

        Random random = new Random();
        int randomIndex = random.nextInt(greetings.length);

        System.out.printf(greetings[randomIndex], firstName, lastName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = getUserName(scanner, "first name");
        String lastName = getUserName(scanner, "last name");
        scanner.close();

        generateRandomGreeting(firstName, lastName);
    }
}