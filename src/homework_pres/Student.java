package homework_pres;

import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    public static void removeBadStudent(List<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            List<Integer> grades = student.getGrades();
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            double average = sum / grades.size();
            if (average < 3.0) {
                iterator.remove();
            } else {
                student.course++;
            }
        }
    }
    public void printStudents(List<Student> students, int course) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


    }

    public List<Integer> getGrades() {
        return grades;
    }
    public String toString() {
        return name + " (" + group + "), Course: " + course + ", Grades: " + grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
