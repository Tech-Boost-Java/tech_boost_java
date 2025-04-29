package homework;

import java.util.ArrayList;
import java.util.List;

import static homework.Student.removeBadStudent;

public class DemoStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", "Кн-3", 1, List.of(4, 3, 5)));
        studentList.add(new Student("Valeriy", "Кн-3", 1, List.of(2, 2, 2)));
        studentList.forEach(System.out::println);
        removeBadStudent(studentList);
        studentList.forEach(System.out::println);
    }
}
