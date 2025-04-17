package Homeworks.Homework_oop;

import java.util.Calendar;
import java.util.Scanner;


public class Person {

    Scanner sc = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this.firstName = "Unnamed Person";
        this.lastName = "Unnamed Person";
        this.birthYear = 0;
    }
    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (this.birthYear == 0)
            return 0;
        return currentYear - this.birthYear;
    }

    public void input() {
        System.out.print("Enter First Name: ");
        this.firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        this.lastName = sc.nextLine();
        System.out.print("Enter Birth Year: ");
        this.birthYear = sc.nextInt();
    }
    public void output() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Birth Year: " + this.birthYear);
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

}
