package homework_Collection_part2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Course: " + getCourse();
    }

    public static void printStudent(List<Student> studentList, int course) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course)
                System.out.println(student);
        }
    }

    public static boolean studentEqualByName(Student student1, Student student2) {
        return student1.getName().equals(student2.getName());
    }

    public static boolean studentEqualByCourse(Student student1, Student student2) {
        return student1.getCourse() == student2.getCourse();
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Andrii", 2));
        students.add(new Student("Bohdan", 1));
        students.add(new Student("Oksana", 3));
        students.add(new Student("Kateryna", 2));
        students.add(new Student("Yurii", 1));

        System.out.println("Students in course 2:");
        printStudent(students, 2);

        students.sort(Comparator.comparing(Student::getName));
        System.out.println("\nStudent list after sort by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        students.sort(Comparator.comparing(Student::getCourse));
        System.out.println("\nStudent list after sort by course:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
