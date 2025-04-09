package homework.hw3_CollectionsandGenericsPart1;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    // 1
    static class Student {
        private String name;
        private String group;
        private int course;
        private List<Integer> grades;

        public Student(String name, String group, int course, List<Integer> grades) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.grades = grades;
        }

        public double getAverageGrade() {
            int sum = 0;
            for (Integer grade : grades) {
                sum += grade;
            }
            if (sum == 0) {
                return 0;
            }
            return sum / grades.size();
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public String getName() {
            return name;
        }

        public double getGradePointAverage() {
            return getAverageGrade();
        }

        @Override
        public String toString() {
            return name + " (Course: " + course + ")";
        }
    }

    static class StudentRealisation {
        // 2
        public static void removeStudentsBelowAverage(List<Student> students) {
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                if (student.getAverageGrade() < 3) {
                    students.remove(i);
                    i--;
                } else {
                    student.setCourse(student.getCourse() + 1);
                }
            }
        }

        // 3
        public static void printStudents(List<Student> students, int course) {
            for (Student student : students) {
                if (student.getCourse() == course) {
                    System.out.println(student.getName());
                }
            }
        }
    }

    public static class Main {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();

            students.add(new Student("Alice", "A1", 1, List.of(4, 5, 3, 4)));
            students.add(new Student("Bob", "B1", 2, List.of(2, 2, 3, 3)));
            students.add(new Student("Charlie", "C1", 3, List.of(5, 4, 5, 5)));
            students.add(new Student("David", "D1", 1, List.of(3, 3, 2, 3)));

            StudentRealisation.removeStudentsBelowAverage(students);

            System.out.println("Students in course 2:");
            StudentRealisation.printStudents(students, 2);

            System.out.println("Students in course 3:");
            StudentRealisation.printStudents(students, 3);
        }
    }
}
