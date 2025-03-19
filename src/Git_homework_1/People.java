package Git_homework_1;

import java.util.Scanner;
import java.time.LocalDate;

public class People {

    public static class Person{
        static Scanner input = new Scanner(System.in);
        private String firstName;
        private String lastName;
        private int birthYear;
        public Person(){};
        public Person(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        };
        public int getAge(){
            int currentYear = LocalDate.now().getYear();
            return currentYear-birthYear;
        };
        public void input(){
            System.out.print("Enter your first name: ");
            firstName = input.nextLine();
            System.out.print("Enter your last name: ");
            lastName = input.nextLine();
            System.out.print("Enter your birth year: ");
            birthYear = input.nextInt();
        }
        public void output(){
            System.out.println("Your first name is "+firstName + "\nYour last name is "+lastName + "\nYour birth year is " + birthYear);
        }
        public void changeName(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public static void main(String[] args) {
        Person Ivan = new Person();
        Ivan.input();
        Ivan.output();
        Person NPC = new Person();
        NPC.output();
        Person Jack = new Person("Jack", "Johnes");
        Jack.output();
    }
}
