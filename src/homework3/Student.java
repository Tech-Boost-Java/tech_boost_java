package homework3;
import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int group;
    int course;
    List<Integer> grades;


    public Student(String name, int group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }


    public double getGrade() {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }


    public static void removeAndPromoteStudents(List<Student> students) {

        for (int i = students.size() - 1; i >= 0; i--) {
            Student student = students.get(i);
            if (student.getGrade() < 3.0) {
                students.remove(i);
            } else {
                student.course++;
            }
        }
    }


    public static void printStudents(List<Student> students, int course) {
        boolean found = false;
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students in course " + course);
        }
    }

    @Override
    public String toString() {
        return name + " (Course " + course + ") grade: " + getGrade();
    }


    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        List<Integer> grades1 = List.of(4, 5, 3, 4);
        students.add(new Student("Alice", 1, 1, grades1));

        List<Integer> grades2 = List.of(2, 3, 1, 2);
        students.add(new Student("Bob", 1, 1, grades2));

        List<Integer> grades3 = List.of(4, 4, 5, 5);
        students.add(new Student("Charlie", 1, 2, grades3));


        removeAndPromoteStudents(students);


        System.out.println("Students in course:");
        printStudents(students, 2);
    }
}