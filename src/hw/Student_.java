package hw;
import java.util.*;

public class Student_ {
    private String name;
    private int course;

    public Student_(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student_> students, int course) {
        System.out.println("Students in course " + course + ":");
        Iterator<Student_> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student_ s = iterator.next();
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student_> students = new ArrayList<>();
        students.add(new Student_("Petro", 1));
        students.add(new Student_("Diana", 2));
        students.add(new Student_("Marta", 1));
        students.add(new Student_("Oleh", 3));
        students.add(new Student_("Nastia", 2));

        Student_.printStudents(students, 2);

        students.sort(Comparator.comparing(Student_::getName));
        System.out.println("\nSorted by name: ");
        for (Student_ s : students) {
            System.out.println(s.getName() + " (" + s.getCourse() + ")");
        }

        students.sort(Comparator.comparingInt(Student_::getCourse));
        System.out.println("\nSorted by course: ");
        for (Student_ s : students) {
            System.out.println(s.getName() + " (" + s.getCourse() + ")");
        }
    }
}
