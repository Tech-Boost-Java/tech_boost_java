package homeworks.Collection_HW;

import java.util.ArrayList;
import java.util.List;

public class CollectionsHW2 {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Alice Johnson", "Group A", 1, 1, 1, 1, 1));
        studentList.add(new Student("Bob Smith", "Group B", 1, 3, 4, 3, 3));
        studentList.add(new Student("Charlie Davis", "Group A", 3, 5, 5, 5, 5));
        studentList.add(new Student("Diana Lee", "Group C", 1, 4, 4, 3, 4));
        studentList.add(new Student("Ethan Carter", "Group B", 2, 3, 4, 3, 4));
        studentList.add(new Student("Faythe Miller", "Group A", 3, 5, 5, 4, 5));
        studentList.add(new Student("George Martin", "Group C", 1, 2, 2, 2, 3));
        studentList.add(new Student("Hannah Clark", "Group B", 2, 4, 4, 4, 4));
        studentList.add(new Student("Ian Brown", "Group A", 3, 5, 5, 5, 4));
        studentList.add(new Student("Jessica White", "Group C", 1, 3, 3, 3, 4));

        removeAndPromoteStudents(studentList);
        System.out.println(studentList + "\n");
        printStudents(studentList, 2);
    }

    public static void removeAndPromoteStudents(List<Student> studentList) {
        for (int i = studentList.size() - 1; i >= 0; i--) {
            if (studentList.get(i).avarageScore() < 3) {
                studentList.remove(i);
            } else {
                studentList.get(i).promote();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course) {
                System.out.println(students.get(i));
            }
        }
    }
}

class Student {
    private String name;
    private String group;
    private int course;
    private int mathGrade;
    private int PEGrade;
    private int physicsGrade;
    private int chemistryGrade;

    public Student(String name, String group, int course, int mathGrade, int PEGrade, int physicsGrade, int chemistryGrad) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathGrade = mathGrade;
        this.PEGrade = PEGrade;
        this.physicsGrade = physicsGrade;
        this.chemistryGrade = chemistryGrad;
    }

    public double avarageScore() {
        return (double) (this.mathGrade + this.PEGrade + this.chemistryGrade + this.physicsGrade) / 4;
    }

    public void promote() {
        this.course++;
    }

    @Override
    public String toString () {
        return "'" + this.name + "' '" + this.group + "' course: " + this.course + " avarageScore: " + this.avarageScore();
    }

    public int getCourse() {
        return course;
    }
}


/*
Create a class called Student which includes the following fields: name, group, course, and grades in different subjects. Create a collection that holds all objects. Write a methods that:
removes students with a grade point average of less than 3. If a student's average score is 3 or higher, then they will be automatically promoted to the next course level.
printStudents(List<Student> students, int course) which takes a list of students and a course number as inputs. This method should print out the names of the students who are enrolled in the specified course number to the console.
In main() method create collection and output result.
 */