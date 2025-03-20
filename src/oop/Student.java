package oop;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.age = 18;
    }
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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
        if(firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        this.age = age;
    }
}

