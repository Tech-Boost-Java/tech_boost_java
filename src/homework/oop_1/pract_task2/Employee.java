package homework.oop_1.pract_task2;

// Create class called Employee that should consist of:
//  • three private fields: name, rate and hours;
//  • a static field called totalSum
//  • properties to access these fields;
//  • a default constructor and two constructors with parameters;
//  • Methods:
//      • getSalary() - to calculate the salary of an employee (formula rate * hours);
//      • toString() - to output information about the employee;
//      • getBonuses() – to calculate 10% from salary.

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private static double totalSum = 0;

    // properties to access name, rate, hours and totalSum
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        totalSum -= getSalary();
        this.rate = rate;
        totalSum += getSalary();
    }

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        totalSum -= getSalary();
        this.hours = hours;
        totalSum += getSalary();
    }

    public double getTotalSum() {
        return totalSum;
    }
    public void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    // default constructor
    public Employee() {
        name = "New Employee";
        rate = 0.0;
        hours = 0;
    }
    // constructor with 1 parameter
    public Employee(String name) {
        this.name = name;
        rate = 0.0;
        hours = 0;
    }
    // constructor with 3 parameters
    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    // method to calculate the salary of an employee
    public double getSalary() {
        return rate * hours;
    }
    // method to calculate 10% from salary
    public double getBonuses() {
        return getSalary() * 0.1;
    }
    // method to output information about the employee
    @Override
    public String toString() {
        return "Employee's name: " + name + "\nRate: " + rate + "\nHours: " + hours +
                "\nSalary: " + getSalary() + "\nBonuses: " + getBonuses() + "\n";
    }
}
