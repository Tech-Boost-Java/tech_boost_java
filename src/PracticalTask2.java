
public class PracticalTask2 {
    static class Employee{
        private String name;
        private int rate;
        private int hours;
        private static int totalSum = 0;
        public int getSalary(){
            return rate * hours;
        }
        public String getName() {
            return name;
        }
        public static int getTotal(){
            return totalSum;
        }
        public int getBonuses(){
            return (int) (0.1 * getSalary());
        }
        public Employee(String name, int rate, int hours){
            this.name = name;
            this.rate = rate;
            this.hours = hours;
            totalSum += getSalary();
        }
    }
    public static void main(String[] args){
        Employee e1 = new Employee("John", 50, 160);
        Employee e2 = new Employee("Andrii", 101, 180);
        Employee e3 = new Employee("Mary", 55, 160);

        int sum = Employee.getTotal();

        System.out.println(" Total salary: " + sum);
    }
}
