package Lesson3_tasks;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    public static double TotalSum;


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
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return TotalSum;
    }

    Employee(){
        name = "Stepan Giga";
        rate = 5.0;
        hours = 1000.0;

    }
    Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;

    }
    Employee(String name, double hours) {
        this.name = name;
        this.hours = hours;
        rate = 3.0;

    }

    public double getSalary() {
        double salary = this.rate * this.hours;
        TotalSum += salary;
        return this.rate * this.hours;
    }
    public double getBonuses() {
        return (this.rate * this.hours) * 0.1;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "Name = " + name +
                ", Rate = " + rate +
                ", Hours= " + hours +
                ", Salary= " + getSalary() +
                ", Bonuses = " + getBonuses() +
                '}';
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivo Bobul", 20.0, 40.0);
        Employee emp2 = new Employee();
        Employee emp3 = new Employee("Kvitka Cisyk",45.0);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println("Total salary of all employees: " + Employee.TotalSum);
    }
}
