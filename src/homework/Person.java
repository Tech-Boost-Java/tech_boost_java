package homework;
import java.util.Scanner;
import java.util.Calendar;
public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public Person(){
        this.firstName = "not entered";
        this.lastName = "not entered";
        this.birthYear = 1990;
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getAge(){
        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);
        int result = year - birthYear;
        return result;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }
    public void output(){
        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Age: " + getAge());
    }
    public void changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }
    public static void main( String[] args ){
        Person person1 = new Person();
        person1.input();
        person1.output();
        Person person2 = new Person();
        person2.input();
        person2.output();
        Person person3 = new Person();
        person3.input();
        person3.output();
        Person person4 = new Person();
        person4.input();
        person4.output();
        Person person5 = new Person();
        person5.input();
        person5.output();
    }
}
