package Homeworks.Homework_collections2;

import java.util.*;

class Student {
    private String name;
    private Integer course;

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }
    public void setCourse(Integer course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, Integer course) {
        System.out.println("Students enrolled in course " + course + ":");

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static Comparator<Student> compareByName() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareToIgnoreCase(s2.getName());
            }
        };
    }

    public static Comparator<Student> compareByCourse() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getCourse() - s2.getCourse();
            }
        };
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", course=" + course + "]";
    }

    public static void main(String[] args) {
        // Create a list to store Student objects
        List<Student> students = new ArrayList<>();

        // Add five different Student objects
        students.add(new Student("Maria Johnson", 3));
        students.add(new Student("Alex Smith", 2));
        students.add(new Student("Zoe Thompson", 1));
        students.add(new Student("David Lee", 3));
        students.add(new Student("Emma Garcia", 2));

        // Display original list
        System.out.println("Original list of students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort and display list by name
        Collections.sort(students, Student.compareByName());
        System.out.println("\nStudents sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort and display list by course
        Collections.sort(students, Student.compareByCourse());
        System.out.println("\nStudents sorted by course:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Test printStudents method for course 2
        System.out.println();
        printStudents(students, 2);

        // Test printStudents method for course 3
        System.out.println();
        printStudents(students, 3);
    }
}
