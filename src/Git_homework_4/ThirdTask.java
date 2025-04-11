package Git_homework_4;

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

    public static void printStudents (List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Here is a list of students enrolled for " + course + " course");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", course: " + course + ";";
    }

    public static Comparator<Student> compareByName = new Comparator<Student>() {
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    };

    public static Comparator<Student> compareByCourse = new Comparator<Student> (){
        public int compare(Student s1, Student s2){
            return Integer.compare(s1.getCourse(), s2.getCourse());
        }
    };




}

public class ThirdTask {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(new Student("Egor", 1), new Student("Andrii", 2), new Student("Oleksii", 4), new Student("Max", 5), new Student("Grisha", 4)));
        Collections.sort(students, Student.compareByCourse);
        System.out.println("Students sorted by course: ");
        for (Student student : students) {
            System.out.println(student);
        }
        Collections.sort(students, Student.compareByName);
        System.out.println("Students sorted by name: ");
        for (Student student : students) {
            System.out.println(student);
        }

        Student.printStudents (students, 4);
    }


}
