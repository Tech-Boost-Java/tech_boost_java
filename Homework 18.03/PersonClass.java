import java.time.LocalDate;
import java.util.Scanner;

public class PersonClass {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = 5;
            Person[] people = new Person[count];

            for (int i = 0; i < count; i++) {
                System.out.printf("\nPerson %d:%n", i + 1);
                people[i] = new Person();
                people[i].input(scanner);
            }

            System.out.println("\nPersons Information:");
            for (Person person : people) {
                System.out.println("-----------");
                person.output();
            }
        }
    }
}

final class Person {
    private String firstName, lastName;
    private int birthYear;

    public Person() {
        this.firstName = "Dzhordzh";
        this.lastName = "Orvell";
        this.birthYear = 1984;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setBirthYear(LocalDate.now().getYear());
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
        int thisYear = LocalDate.now().getYear();
        if (birthYear >= 1914 && birthYear <= thisYear) {
            this.birthYear = birthYear;
        }
        else {
            this.birthYear = thisYear;
        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.birthYear;
    }

    public void input(Scanner scanner) {
        System.out.println("Enter first name: ");
        this.setFirstName(scanner.nextLine());

        System.out.println("Enter last name: ");
        this.setLastName(scanner.nextLine());

        System.out.println("Enter birth year: ");
        this.setBirthYear(scanner.nextInt());
        scanner.nextLine();
    }

    public void output() {
        System.out.printf(
            "Name: %s %s \nAge: %d%n", 
            this.getFirstName(), 
            this.getLastName(), 
            this.getAge()
        );
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
