package homework;

import java.util.Scanner;
import java.util.Calendar;

public class hw1 {
    public static class task1 {
        //Geron's formula
        public static double calculateArea(double side1, double side2, double side3) {
            double halfPerimeter = (side1 + side2 + side3) / 2;
            return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input Side 1: ");
            double side1 = scanner.nextDouble();
            System.out.print("Input Side 2: ");
            double side2 = scanner.nextDouble();
            System.out.print("Input Side 3: ");
            double side3 = scanner.nextDouble();

            scanner.close();

            double triangleArea = calculateArea(side1, side2, side3);

            System.out.println("The area of the triangle is " + triangleArea);
        }
    }

    public static class task2 {
        public static double findSmallestNumber(double number1, double number2, double number3) {
            return Math.min(number1, Math.min(number2, number3));
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input the first number: ");
            double number1 = scanner.nextDouble();
            System.out.print("Input the second number: ");
            double number2 = scanner.nextDouble();
            System.out.print("Input the third number: ");
            double number3 = scanner.nextDouble();

            scanner.close();

            double theSmallestNumber = findSmallestNumber(number1, number2, number3);
            System.out.println("The smallest number is " + theSmallestNumber);

        }
    }

    public static class task3 {
        public static class Person {
            private String firstName;
            private String lastName;
            private int birthYear;

            //getters and setters (properties)
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

            //default constructor
            public Person() {
                this.firstName = "Unknown";
                this.lastName = "Unknown";
                this.birthYear = 2000;
            }

            //constructor with first name and last name
            public Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.birthYear = 2000;
            }

            //calculate the age
            public int getAge() {
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                return currentYear - birthYear;
            }

            //input details of the person
            public void input() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter first name: ");
                this.firstName = scanner.nextLine();

                System.out.print("Enter last name: ");
                this.lastName = scanner.nextLine();

                System.out.print("Enter birth year: ");
                this.birthYear = scanner.nextInt();
            }

            //display the details of the person
            public void output() {
                System.out.println("Full Name: " + firstName + " " + lastName);
                System.out.println("Birth Year: " + birthYear);
                System.out.println("Age: " + getAge() + " years old");
                System.out.println();
            }

            //change the first and/or last name
            public void changeName(String fn, String ln) {
                if (!fn.isEmpty()) this.firstName = fn;
                if (!ln.isEmpty()) this.lastName = ln;
            }
        }

        public static void main(String[] args) {
            Person[] people = new Person[5];

            //input 5 people
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter details for Person " + (i + 1) + ":");
                people[i] = new Person();
                people[i].input();
            }

            //display all people
            System.out.println("\nDisplaying Information of All Persons:");
            for (Person person : people) {
                person.output();
            }
            //example of changing a name
            System.out.println("\nChanging name of Person 1...");
            people[0].changeName("Michael", "Jordan");
            System.out.println("Updated details of Person 1:");
            people[0].output();

        }
    }
}