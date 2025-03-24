package hw;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String first_name;
    private String last_name;
    private int birthyear;

    public Person() {}
    public Person(String first_name, String last_name, int birthyear) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthyear = birthyear;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public int getBirthyear() {
        return birthyear;
    }
    public void getAge()
    {
        int year = Year.now().getValue();
        System.out.println("This person is: " + (year-birthyear) + " years old.");
        return;
    }
    public void input(Scanner sc) {
        System.out.print("First Name: ");
        first_name = sc.nextLine();
        System.out.print("Last Name: ");
        last_name = sc.nextLine();
        System.out.print("Birth Year: ");
        birthyear = sc.nextInt();
        sc.nextLine();
        return;
    }
    public void output() {
        System.out.println("First Name: " + first_name);
        System.out.println("Last Name: " + last_name);
        System.out.println("Birth Year: " + birthyear);
        return;
    }
    public void changeName(String fn, String ln)
    {
        if(!fn.isEmpty())
        {
            first_name = fn;
        }
        if(!ln.isEmpty())
        {
            last_name = ln;
        }
        return;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        Person[] array = {person1, person2, person3, person4, person5};
        for(int i=0; i<5; i++)
        {
            array[i].input(sc);
        }
        for(int i=0; i<5; i++)
        {
            array[i].getAge();
            array[i].output();
        }
        sc.close();
    }
}
