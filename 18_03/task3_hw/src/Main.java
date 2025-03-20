import java.util.Scanner;

class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear =0;
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
        int currentYear = 2025;
        return currentYear - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }


    public void output() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge() + " years");
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        System.out.println("Enter information for Person 1:");
        person1.input();
        System.out.println("Enter information for Person 2:");
        person2.input();
        System.out.println("Enter information for Person 3:");
        person3.input();
        System.out.println("Enter information for Person 4:");
        person4.input();
        System.out.println("Enter information for Person 5:");
        person5.input();

        System.out.println("\nPerson 1 Information:");
        person1.output();
        System.out.println("\nPerson 2 Information:");
        person2.output();
        System.out.println("\nPerson 3 Information:");
        person3.output();
        System.out.println("\nPerson 4 Information:");
        person4.output();
        System.out.println("\nPerson 5 Information:");
        person5.output();

        person3.changeName("David", "Jones");
        System.out.println("\nUpdated Person 3 Information:");
        person3.output();
    }
}
