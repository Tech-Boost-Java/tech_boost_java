package homework_oop;

import java.util.Scanner;
import java.time.LocalDate;

public class Person {
    private String firstName, lastName;
    private int birthYear;

    static Scanner scanner = new Scanner(System.in);

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.setBirthYear(LocalDate.now().getYear());
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setBirthYear(birthYear);
    }

    public String getFirstName() {
        return firstName.isEmpty() ? "Empty" : firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName.isEmpty() ? "Empty" : lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        int thisYear = LocalDate.now().getYear();
        if (thisYear < birthYear)
            this.birthYear = thisYear;
        else
            this.birthYear = birthYear;

    }

    public void input() {
        System.out.print("Enter the first Name: ");
        this.setFirstName(scanner.nextLine());
        System.out.print("Enter the last Name: ");
        this.setLastName(scanner.nextLine());
        System.out.print("Enter the birth Year: ");
        this.setBirthYear(scanner.nextInt());
        scanner.nextLine();
    }

    public void output() {
        System.out.println("First Name: " + this.getFirstName());
        System.out.println("Last Name: " + this.getLastName());
        System.out.println("Birth Year: " + this.getBirthYear());
    }

    public void changeName(String newFirstName, String newLastName) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }
}
