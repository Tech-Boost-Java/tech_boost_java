package homework;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Hello, Test3");
        int choice;
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person2.setFirstName("John");
        person3.setFirstName("Alice");
        person4.setFirstName("Bob");
        person5.setFirstName("Eve");

        person2.setLastName("Blos");
        person3.setLastName("Nual");
        person2.setFirstName("Kendal");
        person3.setFirstName("Mross");

        person2.setBirthYear(1990);
        person3.setBirthYear(1995);
        person4.setBirthYear(2000);
        person5.setBirthYear(2005);



        do {
            System.out.println("1. Output data for person\n2. Get age of person\n3. Input data for person\n4. Exit\nChoice ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    person1.output();
                    break;
                case 2:
                    person1.getAge();
                    System.out.println("Age = " + person1.getAge());
                    break;
                case 3:
                    person1.input();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 4) ;
    }
}
