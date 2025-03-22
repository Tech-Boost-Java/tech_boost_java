package homework_oop;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 1995);
        Person person2 = new Person();

        System.out.println("=== Person 1 ===");
        person1.output();
        System.out.println("Age: " + person1.getAge());

        System.out.println("\nChange name of Person 1:");
        person1.changeName("Michael", "Smith");
        person1.output();

        System.out.println("\n=== Person 2 ===");
        person2.output();
        System.out.println("Age: " + person2.getAge());

        System.out.println("\nEnter new info of person 2:");
        person2.input();
        System.out.println("\nInfo of Person 2");
        person2.output();
        System.out.println("Age: " + person2.getAge());

        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        System.out.println("\n=== Person 3 ===");
        person3.input();
        System.out.println("\nInfo of Person 3");
        person3.output();
        System.out.println("Age: " + person3.getAge());

        System.out.println("\n=== Person 4 ===");
        person4.input();
        System.out.println("\nInfo of Person 4");
        person4.output();
        System.out.println("Age: " + person4.getAge());

        System.out.println("\n=== Person 5 ===");
        person5.input();
        System.out.println("\nInfo of Person 5");
        person5.output();
        System.out.println("Age: " + person5.getAge());

    }
}
