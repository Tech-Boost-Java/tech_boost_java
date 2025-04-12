package practice.practice2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    public static double totalSum = 0;

    public Employee() {
        this.name = "Unknown";
        this.rate = 0;
        this.hours = 0;
    }

    public Employee(String name, int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRate(int rate){
        this.rate = rate;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public String getName(){
        return name;
    }

    public int getRate(){
        return rate;
    }

    public int getHours(){
        return hours;
    }

    public int getSalary(){
        return this.rate * this.hours;
    }

    public double getBonuses(){
        return getSalary() * 0.1;
    }

    public static void calcTotalSum(Employee[] employees){
        totalSum = 0;
        for(Employee employee : employees){
            totalSum += employee.getSalary();
        }
    }

    public static void main(String[] args){
        Employee e1 = new Employee("John", 10, 20);
        Employee e2 = new Employee("Igor", 3, 12);
        Employee e3 = new Employee("Maria", 5, 7);
        Employee[] employees = {e1, e2, e3};
        calcTotalSum(employees);
        System.out.println(totalSum);
    }
}
