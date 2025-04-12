package Git_Homework_1;

import java.util.Scanner;
import java.time.Year;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        birthYear = 2000;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public void input() {
        System.out.println("Enter first name: ");
        Scanner name1 = new Scanner(System.in);
        this.firstName = name1.nextLine();
        System.out.println("Enter last name: ");
        Scanner name2 = new Scanner(System.in);
        this.lastName = name2.nextLine();
        System.out.println("Enter birth year: ");
        Scanner name3 = new Scanner(System.in);
        this.birthYear = name3.nextInt();
    }

    public void output(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Year: " + getAge());
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    public static void main(String[] args) {
        Person p = new Person("Jamal", "Jackson");
        p.getAge();
        p.output();
        p.changeName("Sasuke", "Uchiha");
        p.output();

        Person p2 = new Person();
        p2.input();
        p2.output();
        p2.changeName("Sasuke", "Uchiha");
        p2.output();
    }
}

