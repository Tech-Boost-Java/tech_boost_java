package lesson3;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
        this.firstName = "Ivan";
        this.lastName = "Ivanov";
        this.age = 0;
    }

    public Student(String firstName, String lastName, int age) {
        if (firstName == null || lastName == null || age < 0) {
            System.out.println("Invalid input");
            this.firstName = "Ivan";
            this.lastName = "Ivanov";
            this.age = 0;
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

    }

    public boolean passExam(String object) {
        return true;
    }
    public void printFullName() {
        System.out.println(firstName + " " + lastName + " " + age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            System.out.println("First name cannot be empty or null");
        } else {
            this.firstName = firstName;
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            System.out.println("Last name cannot be empty or null");
        } else {
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
            age = 0;
        } else {
            this.age = age;
        }
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(null, null, 19);
        s1.printFullName();
        System.out.println(s1.passExam("Math"));
    }
}