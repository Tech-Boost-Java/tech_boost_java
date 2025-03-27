package oop;

class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.printFullName();
        student1.passExam("Math");
        student1.setFirstName("Anna");
        student1.getFirstName();
        System.out.println(student1);


    }
}