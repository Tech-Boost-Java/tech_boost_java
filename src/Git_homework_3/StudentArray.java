package Git_homework_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Student {
    private String name;
    private int course;
    private String group;
    private int[] grades = new int[5];
    public Student(String name, int course, String group, int[] grades) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.grades =  grades;
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
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public int[] getGrades() {
        return grades;
    }
    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}



public class StudentArray {

    private static final int MAX_GRADE = 12;
    private static final int MAX_COURSE = 7;

    public static void averageGrades(List<Student> students) {
        List<Student>  sortedStudents = new ArrayList<Student>();
        for (Student student : students) {
            int[] grades = student.getGrades();
            double sum = 0.0;
            for (int i :  grades) {
                sum += i;
            }
            if (sum/grades.length < 3){
                sortedStudents.add(student);
            }
            else{
                int course  = student.getCourse();
                if (course != MAX_COURSE) {
                    student.setCourse(course+1);
                }
            }
        }
        students.removeAll(sortedStudents);
    }

    public static void printStudents(List<Student> students) {
        System.out.println("Here is names of students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Here is names of students from " + course + " course" );
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        List<String> studentNames = new LinkedList<>();
        studentNames.add("Egor"); studentNames.add("Grisha"); studentNames.add("Max"); studentNames.add("Andrii"); studentNames.add("Mikola"); studentNames.add("Oleksandr");
        String[] groupNames = new String[]{"K-16", "K-17", "K-15", "K-14", "K-13", "K-12"};
        Random rand = new Random();
        final int MAX_GRADE = 12;
        final int MAX_COURSE = 7;
        for (int i = 0; i < studentNames.size(); i++){
            int index = rand.nextInt(studentNames.size());
            students.add(new Student(studentNames.get(index),
                    rand.nextInt(1, MAX_COURSE),
                    groupNames[rand.nextInt(groupNames.length)],
                    new int[]{rand.nextInt(MAX_GRADE), rand.nextInt(MAX_GRADE), rand.nextInt(MAX_GRADE), rand.nextInt(MAX_GRADE), rand.nextInt(MAX_GRADE)}
                    ));
            studentNames.remove(index);
        }

        averageGrades(students);
        printStudents(students);
        printStudents(students, 7);
        printStudents(students, 2);
        printStudents(students, 3);
    }


}
