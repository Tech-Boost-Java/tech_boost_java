package HomeTasks;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        firstName = "";
        lastName = "";
        birthYear = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        birthYear = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public void input(Scanner scanner) {
        System.out.print("Enter First Name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter Birth Year: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid birth year:");
            scanner.next(); // Consume invalid input
        }
        this.birthYear = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
    }

    public void output() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        if(!fn.isEmpty()) {
            this.firstName = fn;
        }
        if(!ln.isEmpty()) {
            this.lastName = ln;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create 5 Person objects
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        // Input details
        System.out.println("\nEnter details for Person 1:");
        person1.input(scanner);

        System.out.println("\nEnter details for Person 2:");
        person2.input(scanner);

        System.out.println("\nEnter details for Person 3:");
        person3.input(scanner);

        System.out.println("\nEnter details for Person 4:");
        person4.input(scanner);

        System.out.println("\nEnter details for Person 5:");
        person5.input(scanner);

        // Display details
        System.out.println("\nPerson Details:");
        person1.output();
        System.out.println();
        person2.output();
        System.out.println();
        person3.output();
        System.out.println();
        person4.output();
        System.out.println();
        person5.output();

        scanner.close();

    }
}
