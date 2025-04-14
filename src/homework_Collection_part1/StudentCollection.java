package homework_Collection_part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, ArrayList<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
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

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

}

public class StudentCollection {
    public static void averageGrade(List<Student> students) {
        List<Student> studentToRemove = new ArrayList<>();

        for (Student student : students) {
            List<Integer> grades = student.getGrades();
            int sum = grades.stream().reduce(0, Integer::sum);
            if ((double) sum / grades.size() < 3.0) {
                studentToRemove.add(student);
            } else {
                if (student.getCourse() == 4) {
                    System.out.println("Student " + student.getName() + " graduated!");
                    studentToRemove.add(student);
                } else
                    student.setCourse(student.getCourse() + 1);
            }
        }

        students.removeAll(studentToRemove);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in course" + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(" - " + student.getName() + " (Group: " + student.getGroup() + ")");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Anna", "FEI-13", 1, new ArrayList<>(Arrays.asList(5, 4, 4, 3))));
        students.add(new Student("Igor", "FEI-14", 1, new ArrayList<>(Arrays.asList(2, 3, 2, 3))));

        students.add(new Student("Maria", "FEI-21", 2, new ArrayList<>(Arrays.asList(3, 3, 3))));
        students.add(new Student("Oleg", "FEI-21", 2, new ArrayList<>(Arrays.asList(1, 2, 2, 3))));
        students.add(new Student("Katerina", "FEI-23", 2, new ArrayList<>(Arrays.asList(5, 5, 5, 4))));

        students.add(new Student("Olga", "FEI-31", 3, new ArrayList<>(Arrays.asList(5, 5, 5, 3))));
        students.add(new Student("Nikita", "FEI-31", 3, new ArrayList<>(Arrays.asList(4, 4, 4, 5))));

        students.add(new Student("Svetlana", "FEI-41", 4, new ArrayList<>(Arrays.asList(5, 5, 5, 2))));
        students.add(new Student("Alex", "FEI-41", 4, new ArrayList<>(Arrays.asList(4, 4, 4, 2))));

        System.out.println("\nStudents before removing:");

        for (int c = 1; c <= 4; c++) {
            StudentCollection.printStudents(students, c);
        }

        StudentCollection.averageGrade(students);

        System.out.println("\nStudents after first removing:");

        for (int c = 1; c <= 4; c++) {
            StudentCollection.printStudents(students, c);
        }

        StudentCollection.averageGrade(students);

        System.out.println("\nStudents after second removing:");

        for (int c = 1; c <= 4; c++) {
            StudentCollection.printStudents(students, c);
        }
    }
}
