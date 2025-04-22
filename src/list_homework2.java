import java.util.ArrayList;
import java.util.List;

public class list_homework2 {
/*
Create a class called Student which includes the following fields: name, group, course, and grades in different subjects. Create a collection that holds all objects. Write a methods that:
removes students with a grade point average of less than 3. If a student's average score is 3 or higher, then they will be automatically promoted to the next course level.
printStudents(List<Student> students, int course) which takes a list of students and a course number as inputs. This method should print out the names of the students who are enrolled in the specified course number to the console.
In main() method create collection and output result.
*/

    static class Student {
        private final String name;
        private final String group;
        private int course;
        private int math;
        private int english;
        private int chemistry;
        private int science;
        private int biology;

        public int getBiology() {
            return biology;
        }

        public void setBiology(int biology) {
            this.biology = biology;
        }

        public int getScience() {
            return science;
        }

        public void setScience(int science) {
            this.science = science;
        }

        public int getMath() {
            return math;
        }

        public void setMath(int math) {
            this.math = math;
        }

        public int getEnglish() {
            return english;
        }

        public String getName() {
            return name;
        }

        public String getGroup() {
            return group;
        }

        public void setEnglish(int english) {
            this.english = english;
        }

        public int getChemistry() {
            return chemistry;
        }

        public void setChemistry(int chemistry) {
            this.chemistry = chemistry;
        }

        public double getAverage() {
            return (double) (this.math + this.english + this.science + this.chemistry + this.biology)/5;
        }

        public Student(String name, String group, int course, int math, int english, int chemistry, int science, int biology) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.math = math;
            this.english = english;
            this.chemistry = chemistry;
            this.science = science;
            this.biology = biology;

        }

        public int getCourse() {
            return this.course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

    }

    static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    private static void checkStudents(List<Student> students) {
        students.removeIf(student -> student.getAverage() < 3);
        for (Student student : students) {
            student.setCourse(student.getCourse() + 1);
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Mykola", "K-10", 1, 6, 7, 9, 3, 4);
        Student student2 = new Student("Oleg", "K-10", 2, 1, 1, 1, 1, 1);
        Student student3 = new Student("Misha", "K-12", 2, 1, 12, 1, 1, 1);
        Student student4 = new Student("Grigoriy", "K-12", 12, 10, 12, 15, 13, 1);
        Student student5 = new Student("Sasha", "K-12", 2, 10, 10, 15, 13, 3);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        checkStudents(students);
        printStudents(students, 2);
        printStudents(students, 3);



}





}
