package homework.oop_1.task3;

// Create Console Application and add class called Person to the project. Class Person should consist of:
// • three private fields: firstName, lastName and birthYear (the birthday year);
// • properties for access to these fields;
// • default constructor and constructor with 2 parameters (first and last names);
// • Methods:
//      • (**) getAge() - to calculate the age of a person;
//      • input() - to input information about the person;
//      • output() - to output information about the person;
//      • changeName(String fn, String ln) - to change the first name or/and last name.
// In the main() method create 5 objects of Person type and input information about them to console.

import java.time.LocalDate;
public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    // properties for access to firstName, lastName and birthYear
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

    // default constructor
    public Person() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
    }

    // constructor with 2 parameters
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // method to calculate the age of person
    public int getAge() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }

    // method to input information about the person
    public void input(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    // method to output information about the person
    public void output() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge() + "\n");
    }

    // method to change the first name or/and last name (method overloading)
    public void changeName(String firstName) {
        this.firstName = firstName;
    }
    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
