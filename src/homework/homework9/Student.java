package homework.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Student {
    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> grades;

    public Student(String name, String group, int course, ArrayList<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

class Main {
    public static void processStudents(ArrayList<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverage() < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }


    public static void printStudents(ArrayList<Student> students, int course) {
        for (Student student : students) {
            if(student.getCourse() == course) System.out.println(student.getName());
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John Smith", "student1", 1, new ArrayList<>(Arrays.asList(4, 5, 3))));
        students.add(new Student("Bob Johnson", "student2", 4, new ArrayList<>(Arrays.asList(3, 3, 4))));
        students.add(new Student("Asar Rakhma", "student3", 3, new ArrayList<>(Arrays.asList(1, 1, 2))));

        processStudents(students);
        printStudents(students, 2);
    }
}
