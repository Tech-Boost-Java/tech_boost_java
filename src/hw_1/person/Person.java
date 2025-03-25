package hw_1.person;

import java.util.Date;
import java.util.Scanner;

public class Person {
    private static final Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private Integer birthYear;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    protected Integer getAge() {
        Date getCurrentDate = new Date();
        int getCurrentYear = getCurrentDate.getYear() + 1900;
        int age = getCurrentYear - birthYear;
        System.out.println("Person`s age: " + age + "\n");
        return age;
    }

    protected void input() {
        System.out.print("Enter person`s first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter person`s last name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter person`s birth year: ");
        birthYear = scanner.nextInt();
        scanner.nextLine();
    }

    protected void output() {
        System.out.println("Person`s first name: " + firstName);
        System.out.println("Person`s last name: " + lastName);
        System.out.println("Person`s birth year: " + birthYear + "\n");
    }

    protected void changeName (String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }
}
