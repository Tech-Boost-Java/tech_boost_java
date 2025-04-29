package homework.oop_1.pract_task2;

// Create class called Employee ...
// In the main() method create 3 objects of type Employee, input information about them.
// Display the total salary of all employees to the console.

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("John");
        emp1.setRate(90.5);
        emp1.setHours(95);
        Employee emp2 = new Employee("Joe");
        emp2.setRate(100);
        emp2.setHours(90);
        Employee emp3 = new Employee("Jane", 80.5, 120);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println("The total salary of all employees: " + emp1.getTotalSum());

    }
}
