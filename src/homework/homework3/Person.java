package homework.homework3;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){
        this.firstName = "Igor";
        this.lastName = "Marchenko";
        this.birthYear = 1997;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = 2000;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public int getAge(){
        return 2025 - this.birthYear;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter the last name: ");
        this.lastName = in.nextLine();
        System.out.print("Enter the birth year: ");
        this.birthYear = in.nextInt();
    }

    public void output(){
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln){
        if (fn != null && ln != null && !fn.isEmpty() && !ln.isEmpty()){
            this.firstName = fn;
            this.lastName = ln;
        }
    }
}
