package homework.homework12;

import java.util.*;

class Student {
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

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }

    public String toString() {
        return "Student{name='" + name + "', course=" + course + "}";
    }
}

class Main {
    public static void main(String[] args) {
        // Create a List of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 3));
        students.add(new Student("David", 1));
        students.add(new Student("Eve", 2));

        // Display all students
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, Student.compareByName());
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, Student.compareByCourse());
        for (Student student : students) {
            System.out.println(student);
        }

        Student.printStudents(students, 1);
    }
}
