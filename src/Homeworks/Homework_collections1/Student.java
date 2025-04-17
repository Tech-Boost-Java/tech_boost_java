package Homeworks.Homework_collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", average grade=" + String.format("%.2f", getAverageGrade()) +
                '}';
    }

    public static void filterAndPromoteStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            double averageGrade = student.getAverageGrade();

            if (averageGrade < 3.0) {
                // Remove students with average grade below 3.0
                iterator.remove();
                System.out.println("Removed student: " + student.getName() + " (Average: " + String.format("%.2f", averageGrade) + ")");
            } else {
                // Promote students with average grade 3.0 or higher
                student.setCourse(student.getCourse() + 1);
                System.out.println("Promoted student: " + student.getName() + " to course " + student.getCourse() +
                        " (Average: " + String.format("%.2f", averageGrade) + ")");
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("\nStudents in course " + course + ":");
        boolean found = false;

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " (Group: " + student.getGroup() + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No students found in course " + course);
        }
    }

    public static void main(String[] args) {
        // Create a collection of students
        List<Student> studentList = new ArrayList<>();

        // Add some students with different grades
        Student student1 = new Student("John Smith", "CS-101", 1);
        student1.addGrade("Math", 4);
        student1.addGrade("Programming", 5);
        student1.addGrade("Physics", 3);
        studentList.add(student1);

        Student student2 = new Student("Emily Johnson", "CS-101", 1);
        student2.addGrade("Math", 2);
        student2.addGrade("Programming", 2);
        student2.addGrade("Physics", 3);
        studentList.add(student2);

        Student student3 = new Student("Michael Brown", "CS-102", 2);
        student3.addGrade("Algorithms", 5);
        student3.addGrade("Databases", 4);
        student3.addGrade("Web Development", 4);
        studentList.add(student3);

        Student student4 = new Student("Sarah Davis", "CS-102", 2);
        student4.addGrade("Algorithms", 2);
        student4.addGrade("Databases", 2);
        student4.addGrade("Web Development", 3);
        studentList.add(student4);

        Student student5 = new Student("David Wilson", "CS-103", 3);
        student5.addGrade("Advanced Algorithms", 3);
        student5.addGrade("Machine Learning", 3);
        student5.addGrade("Software Engineering", 4);
        studentList.add(student5);

        // Print all students before filtering
        System.out.println("All students before filtering:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Filter students with low grades and promote others
        System.out.println("\nFiltering and promoting students:");
        filterAndPromoteStudents(studentList);

        // Print all students after filtering
        System.out.println("\nAll students after filtering and promotion:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Print students by course
        printStudents(studentList, 2);
        printStudents(studentList, 3);
        printStudents(studentList, 4);
    }
}