package oop;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.printFullName();
        System.out.println(student1);
        Student student2 = new Student("John", "Smith", 45);

        student1.setFirstName("Ivan");
        student1.setLastName("Green");
        student1.setAge(32);
        student1.printFullName();
        System.out.println(student1.passExam("Math"));
    }
}
