package homework;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    public Person() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.birthYear = 1900;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBirthYear(int birthYear) {
        if (birthYear > 1900 && birthYear < 2025) {
            this.birthYear = birthYear;
        }
        else {
            System.out.println("Invalid birth year");
        }
    }
    public int getAge() {
        return 2025 - birthYear;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first name:");
        setFirstName(scanner.nextLine());
        System.out.println("Input last name:");
        setLastName(scanner.nextLine());
        System.out.println("Input birth year:");
        setBirthYear(scanner.nextInt());
    }
    public void output() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Age: " + getAge());
    }
    public void changeName(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }
}
