package homeworks.Collection_HW;

import java.util.*;

public class GenericsHW3 {

    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("Evelyn Hayes", 1));
        students.add(new Student1("Maxwell Collins", 2));
        students.add(new Student1("Isabella Blake", 1));
        students.add(new Student1("Jasper Ford", 4));
        students.add(new Student1("Lydia Bennett", 2));

        Student1.printStudents(students, 1);
        students.sort(Student1.compareByName);
        System.out.println(students);
        students.sort(Student1.compareByCourse);
        System.out.println(students);
    }
}

class Student1 {
    private String name;
    private int course;

    public Student1 (String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents (List<? extends Student1> students, int course) {
        Iterator<? extends Student1> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student1 st = iterator.next();
            if (st.getCourse() == course) {
                System.out.println(st.getName());
            }
        }
    }

    public static Comparator<Student1> compareByName = new Comparator<Student1>() {
        @Override
        public int compare(Student1 s1, Student1 s2) {
            return s1.getName().compareTo(s2.getName());
        }
    };

    public static Comparator<Student1> compareByCourse = new Comparator<Student1>() {
        @Override
        public int compare(Student1 s1, Student1 s2) {
            return Integer.compare(s1.getCourse(), s2.getCourse());
        }
    };

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
        return this.name + " " + this.course;
    }
}
/*
Create a class named Student that stores information about the student's name and
course.
• The class should include properties to access these fields, a constructor with
parameters, and a method called printStudents that takes a List of students and an
Integer representing the course number as arguments.
• This method should print the names of the students from the list who are enrolled in
the specified course to the console using an iterator.
• Additionally, add methods to compare students by name and by course.
• In the main() method, create a List named "students" and add five different Student
objects to it. Then, display the list of students sorted by name and sorted by course.
 */
