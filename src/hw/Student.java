package hw;
import java.util.*;

public class Student {
    String name;
    String group;
    int course;
    List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int grade : grades) sum += grade;
        double avg = (double) sum / grades.size();
        return Math.round(avg * 1000.0) / 1000.0;
    }

    public static void removeStudentsWithLowGrades(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.course++;
            }
        }
    }

    public static void printStudentsInCourse(List<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "A1", 1, Arrays.asList(4, 3, 5)));
        students.add(new Student("Bob", "B1", 2, Arrays.asList(2, 3, 2)));
        students.add(new Student("Charlie", "C1", 3, Arrays.asList(3, 3, 3)));
        students.add(new Student("Diana", "D1", 1, Arrays.asList(5, 5, 4)));
        students.add(new Student("Eva", "E1", 2, Arrays.asList(1, 2, 2)));

        System.out.println("Initial list:");
        for (Student s : students) {
            System.out.println(s.name + " (avg: " + s.getAverageGrade() + ")");
        }

        removeStudentsWithLowGrades(students);

        System.out.println("\nAfter filtering and promoting:");
        for (Student s : students) {
            System.out.println(s.name + " (course: " + s.course + ", avg: " + s.getAverageGrade() + ")");
        }

        System.out.println();
        printStudentsInCourse(students, 2);
    }
}
