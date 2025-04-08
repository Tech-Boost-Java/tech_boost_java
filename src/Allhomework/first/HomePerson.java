package Allhomework.first;

import java.util.Scanner;


// Create Console Application and add class called Person to the project. Class Person should consist of:
//• three private fields: firstName, lastName and birthYear (the birthday year);
//• properties for access to these fields;
//• default constructor and constructor with 2 parameters (first and last names);
//• Methods:
//• (**) getAge() - to calculate the age of a person;
//• input() - to input information about the person;
//• output() - to output information about the person;
//• changeName(String fn, String ln) - to change the first name or/and last name.
//In the main() method create 5 objects of Person type and input information about them to console


public class HomePerson {

    public static class Person {
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
            this.birthYear = 0;
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
        public void input(Scanner scanner) {
            System.out.print("Enter first name: ");
            this.firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            this.lastName = scanner.nextLine();

            System.out.print("Enter birth year: ");
            this.birthYear = scanner.nextInt();
            scanner.nextLine();
        }
        public void output() {
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Year of Birth: " + birthYear);
            System.out.println("Age: " + getAge());
        }
        public void changeName(String fn, String ln) {
            if (fn != null && !fn.isEmpty()) {
                this.firstName = fn;
            }
            if (ln != null && !ln.isEmpty()) {
                this.lastName = ln;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[5];
        for (int i = 0; i < people.length; i++) {
            System.out.println("\n--- Person #" + (i + 1) + " ---");
            people[i] = new Person();
            people[i].input(scanner);
        }
        System.out.println("\n--- Outputting Person Information ---");
        for (int i = 0; i < people.length; i++) {
            System.out.println("Person #" + (i + 1) + ":");
            people[i].output();
            System.out.println();
        }
        System.out.println("Changing name of the first person for demonstration...");
        people[0].changeName("John", "Smith");
        System.out.println("New name for the first person:");
        people[0].output();
        scanner.close();
    }
}