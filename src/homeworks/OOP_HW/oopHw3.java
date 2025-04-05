package homeworks.OOP_HW;

import java.util.Scanner;

public class oopHw3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Person[] persons = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Input data for Person " + i + ": ");
            persons[i] = new Person();
            persons[i].input(sc);
        }

        for (Person p : persons) {
            System.out.println(p.output());
        }

        System.out.println("\nData of Person 2 was changed");
        persons[2].changeName("Changed", "");
        System.out.println(persons[2].output());


    }
}
