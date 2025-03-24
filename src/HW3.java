import java.util.Scanner;

public class HW3 {
    static class Person{
        private String firstName;
        private String lastName;
        private int birthYear;

        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public int getBirthYear() {
            return birthYear;
        }
        public Person(String firstName, String lastName, int birthYear) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
        }
        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public int getAge() {
            return 2025-birthYear;
        }
        public void input(Scanner sc) {
            System.out.print("First Name: ");
            firstName = sc.nextLine();
            System.out.print("Last Name: ");
            lastName = sc.nextLine();
            System.out.print("Birth Year: ");
            birthYear = sc.nextInt();
            sc.nextLine();
        }
        public void output(){
            System.out.println("First Name: " + firstName + ", Last Name: " + lastName + ", Birth Year: " + birthYear + " " + getAge());
        }
        public void changeName(String fn, String ln){
            firstName = fn;
            lastName = ln;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[5];
        for(int i = 0; i < people.length; i++){
            people[i] = new Person("", "", 0);
            people[i].input(sc);
        }

        System.out.println("Details: ");
        for(int i = 0; i < people.length; i++){
            people[i].output();
        }

        sc.close();
    }
}
