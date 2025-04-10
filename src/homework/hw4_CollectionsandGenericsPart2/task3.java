package homework.hw4_CollectionsandGenericsPart2;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class task3 {

    static class Student {
        private String name;
        private int course;

        public Student(String name, int course) {
            this.name = name;
            this.course = course;
        }

        public String getName() {
            return name;
        }

        public int getCourse() {
            return course;
        }

        public static void printStudents(@NotNull List<Student> students, int course) {
            System.out.println("Students on course " + course + ": ");
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student s = iterator.next();
                if (s.getCourse() == course) {
                    System.out.println(s.getName());
                }
            }
        }

        @Contract(value = " -> new", pure = true)
        public static @NotNull Comparator<Student> byName() {
            return new Comparator<Student>() {
                public int compare(Student s1, Student s2) {
                    return s1.getName().compareTo(s2.getName());
                }
            };
        }

        @Contract(value = " -> new", pure = true)
        public static @NotNull Comparator<Student> byCourse() {
            return new Comparator<Student>() {
                public int compare(Student s1, Student s2) {
                    return Integer.compare(s1.getCourse(), s2.getCourse());
                }
            };
        }

        @Override
        public String toString() {
            return name + " (Course: " + course + ")";
        }

    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Anna", 2));
        students.add(new Student("Bohdan", 3));
        students.add(new Student("Viktoriia", 1));
        students.add(new Student("Mariia", 2));
        students.add(new Student("Sofiia", 3));

        Student.printStudents(students, 2);

        Collections.sort(students, Student.byName());
        System.out.println("Sorted by name: ");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, Student.byCourse());
        System.out.println("Sorted by course: ");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
