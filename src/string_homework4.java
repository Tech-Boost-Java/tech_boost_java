import java.util.Scanner;
import java.util.Random;

public class string_homework4 {
    /*
    Create a console application that validates user input for their first and last name, ensuring that they
    only contain English letters, spaces, and hyphens. If the input data is incorrect, prompt the user to re-enter
    the data. Upon successful entry of the user's first and last names, generate a random greeting message
    that includes the user's name.
    To validate the user input, utilize String class methods, control loops, and regular expressions. Generate the
    random greeting message (use printf() method for output) by creating an array of phrases that contain
    various text options with the user's name inserted.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String regex = "^[a-zA-Z\\-\\s]+$";
        String name;

        while (true) {
            System.out.println("Enter your first and second name: ");
            name = sc.nextLine().trim();

            if(name.matches(regex)) {
                break;
            } else {
                System.out.println("Invalid name. Try again.");
            }
        }

        String[] greetings = {
                "Hello %s. How Are you?",
                "Welcome to our planet, %s",
                "Greetings, %s",
                "Hi, how are you, %s?"};

        int choice = rand.nextInt(greetings.length);
        System.out.printf(greetings[choice], name);
    }
}
