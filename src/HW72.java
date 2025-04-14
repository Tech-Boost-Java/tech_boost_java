import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HW72 {
    static class Student{
        private final String name;
        private final int groupNumber;
        private int course;
        private final int scoreMath;
        private final int scoreComputer;
        private final int scoreBiology;
        private final int scoreChemistry;
        private final int scorePhysics;
        private final int scoreEnglish;

        public Student(String name, int groupNumber, int course, int scoreMath, int scoreComputer,int scoreBiology, int scoreChemistry, int scorePhysics, int scoreEnglish) {
            this.name = name;
            this.groupNumber = groupNumber;
            this.course = course;
            this.scoreMath = scoreMath;
            this.scoreComputer = scoreComputer;
            this.scoreBiology = scoreBiology;
            this.scoreChemistry = scoreChemistry;
            this.scorePhysics = scorePhysics;
            this.scoreEnglish = scoreEnglish;
        }
        public int averageScore() {
            return (scoreBiology + scoreChemistry + scorePhysics + scoreEnglish + scoreComputer + scoreMath) / 6;
        }
        public int getCourse() {
            return course;
        }
        public String getName() {
            return name;
        }
        public void promoteCourse(){
            course++;
        }
    }
    public static List<Student> removeUnderAverageScore(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            Student s = iterator.next();
            if(s.averageScore() < 3) {
                iterator.remove();
            }
            else {
                s.promoteCourse();
            }
        }
        return students;
    }

    public static void printStudents(List<Student> students, int course){
        System.out.println("Students studying at " + course + "course: ");
        for(Student student : students) {
            if(student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
    public static void printStudents(List<Student> students){
        for(Student student : students) {
            System.out.println("Name: " + student.getName() + ", Course: " + student.getCourse() + ", Average score: " + student.averageScore());
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Smith", 1, 3, 4, 3, 2, 4, 3, 5));
        students.add(new Student("Alice Johnson", 1, 2, 2, 2, 2, 2, 2, 2)); // буде видалена
        students.add(new Student("Bob Brown", 2, 3, 4, 5, 4, 4, 4, 4));
        students.add(new Student("Mary Lee", 1, 4, 5, 4, 5, 5, 5, 5));

        printStudents(students);
        removeUnderAverageScore(students);
        System.out.println("After removing: ");
        printStudents(students);
        printStudents(students, 4);
    }
}
