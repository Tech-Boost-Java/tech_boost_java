package homework_pres;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){

    }
     public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
     }
     public int getAge(int birthYear){
         return 2025 - birthYear;
     }
     public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        this.firstName = scanner.nextLine();
         System.out.print("Enter your last name: ");
         this.lastName = scanner.nextLine();
         System.out.print("Enter your birthday year: ");
         this.birthYear = scanner.nextInt();
     }
    public void output(String firstName, String lastName, int birthYear) {
        System.out.println( "You are: " + firstName + "  " + lastName + ", of  " +  birthYear + " year");
    }
    public void changeName(String firstName, String lastName){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Change you first name: ");
        this.firstName = firstName;
        System.out.println("Change you last name: ");
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
