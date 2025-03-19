package homeworks;

import java.time.LocalDate;

import java.util.Date;
import java.util.Scanner;

public class Person {
    private String firstName, lastName;
    private int birthYear;

    public Person () {

    }
    public Person (String firstName, String lastName) {
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

    public void setlLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge (int birthYear) {
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }

    public void input (Scanner sc) {
        System.out.print("Enter first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        lastName = sc.nextLine();
        System.out.print("Enter birthYear: ");
        birthYear = sc.nextInt();

        sc.nextLine();
    }

    public String output () {
        return firstName + " " + lastName + " " + getAge(birthYear) + " years" ;
    }

    public void changeName(String fn, String ln) {
        if (!fn.isEmpty()) { firstName = fn; }
        if (!ln.isEmpty()) { lastName = ln; }
    }

}
