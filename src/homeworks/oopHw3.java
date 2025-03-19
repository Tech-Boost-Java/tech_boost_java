package homeworks;

import homeworks.Person;

public class oopHw3 {
    public static void main(String[] args) {
        Person p1 = new Person("Maks", "Nazarenko");
        p1.input(2006);

        Person p2 = new Person("Ivan", "Ivanov");
        p2.changeName("Vitalik", null);
        p2.input(2005);

        Person p3 = new Person("Artem", "Artemovich");
        p3.changeName(null, "NeArtemovich");
        p3.input(2004);

        Person p4 = new Person("Vanya", "Vanya");
        p4.changeName("Sergey", "Sergey");
        p4.input(2003);

        Person p5 = new Person();
        p5.changeName("John", "Winchester");
        p5.input(1966);


        System.out.println(p1.output());
        System.out.println(p2.output());
        System.out.println(p3.output());
        System.out.println(p4.output());
        System.out.println(p5.output());
    }
}
