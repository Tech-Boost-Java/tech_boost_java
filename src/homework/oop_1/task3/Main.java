package homework.oop_1.task3;

// Create Console Application and add class called Person to the project.
// In the main() method create 5 objects of Person type and input information about them to console.

public class Main {
    public static void main(String[] args) {
        // using constructor with 2 parameters
        Person person1 = new Person("Michael", "Jones");
        Person person2 = new Person("Julia", "Garcia");
        // using default constructor
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        // input and output methods
        person1.input("Michael", "Jones", 2006);
        person1.output();
        person2.input("Julia", "Garcia", 2003);
        person2.output();

        // output of unknown firstname, lastname and birt year; then - output of initialized fields
        person3.output();
        person3.input("Christopher", "Cage", 2001);
        person3.output();

        // changing firstname and output of changed name
        person4.input("Bob", "Martinez", 2002);
        person4.output();
        person4.changeName("Jack");
        person4.output();

        // changing firstname and lastname, output of changes
        person5.input("Betty", "Black", 2012);
        person5.output();
        person5.changeName("Linda", "Robinson");
        person5.output();
    }
}
