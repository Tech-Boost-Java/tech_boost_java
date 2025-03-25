package hw_1.person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.input();
        person1.output();
        person1.changeName("Anna", "Trincher");
        person1.output();

        Person person2 = new Person("Yurii", "Gorbunov");
        person2.output();

        Person person3 = new Person();
        person3.setBirthYear(2006);
        int age3 = person3.getAge();

        Person person4 = new Person("Kate", "Bush");
        person4.setBirthYear(2001);
        int age4 = person4.getAge();
        person4.output();

        Person person5 = new Person("Josh", "Autumn");
        person5.input();
        int age5 = person5.getAge();
    }
}
