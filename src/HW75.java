import java.util.*;

public class HW75 {
    static class Student{
        private final String name;
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
    }

    public static void printStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.getName() + ", Course:" + student.getCourse());
        }
    }
    public static void printStudentsCourse(List<Student> students, int course){
        System.out.println("Students studying at " + course + "course: ");
        for(Student student : students) {
            if(student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
    static class compareByNames implements Comparator<Student> {
        public int compare(Student s1, Student s2){
            return s1.getName().compareTo(s2.getName());
        }
    }
    static class compareByCourse implements Comparator<Student> {
        public int compare(Student s1, Student s2){
            return Integer.compare(s1.getCourse(), s2.getCourse());
        }
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Smith", 1));
        students.add(new Student("John", 2));
        students.add(new Student("Jane", 3));
        students.add(new Student("Jack", 4));
        students.add(new Student("Jill", 5));
        students.add(new Student("Jach&Jones", 5));
        students.add(new Student("Will", 5));

        printStudents(students);
        printStudentsCourse(students, 5);
        Collections.sort(students, new compareByNames());
        Collections.sort(students, new compareByCourse());

        System.out.println("After compare: ");
        printStudents(students);
    }
}
