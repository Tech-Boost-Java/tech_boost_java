package Homework_oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Triangle.area_of_triangle(a, b, c));
        System.out.println(SmallestNum.smallestNum(a, b, c));
        Person person1 = new Person();
        Person person2 = new Person("Jhon", "Brith", 1990);
        person1.output();
        person2.output();
        System.out.println(person1.getAge());
        System.out.println(person2.getAge());
        person1.input();
        person1.output();
        person2.changeName("Ben", "Brendon");
        person2.output();

    }
}
