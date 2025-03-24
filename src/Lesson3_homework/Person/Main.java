package Lesson3_homework.Person;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            System.out.println("Enter details for person " + (i + 1) + ":");
            persons[i].input();
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println("\nDetails of person " + (i + 1) + ":");
            persons[i].output();
        }
    }
}