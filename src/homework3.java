import java.time.LocalDate;
import java.util.Scanner;

public class homework3 {
static Scanner sc = new Scanner(System.in);
    static class Person {
        private String firstName;
        private String lastName;
        private int birthYear;

        public Person() {
            this.firstName = "no_data";
            this.lastName = "no_data";
            this.birthYear = 0;
        }

        public Person(String firstName, String lastName) {
            if (firstName == null || lastName == null || firstName.trim().isEmpty()) {
                System.out.println("Invalid input");
                this.firstName = "no_data";
                this.lastName = "no_data";
            } else {
                this.firstName = firstName;
                this.lastName = lastName;
            }
            this.birthYear = 0;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            if (firstName == null || firstName.trim().isEmpty()) {
                System.out.println("Invalid input");
            } else {
                this.firstName = firstName;
            }

        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            if (lastName == null || lastName.trim().isEmpty()) {
                System.out.println("Invalid input");
            } else {
                this.lastName = lastName;
            }
        }

        public int getBirthYear() {
            return birthYear;
        }

        public void setBirthYear(int birthYear) {
            if (birthYear > 0 && birthYear <= LocalDate.now().getYear()) {
                this.birthYear = birthYear;
            } else {
                System.out.println("Invalid input");
                this.birthYear = 0;
            }
        }

        public int getAge() {
            return LocalDate.now().getYear() - this.birthYear;
        }

        public void input() {
            String firstName;
            String lastName;
            int birthYear;
            System.out.print("Enter persons first name: ");
            firstName = sc.nextLine();
            if (firstName == null || firstName.trim().isEmpty()) {
                System.out.println("Invalid input");
            } else {
                this.firstName = firstName;
            }
            System.out.print("Enter persons last name: ");
            lastName = sc.nextLine();
            if (lastName == null || lastName.trim().isEmpty()) {
                System.out.println("Invalid input");
            } else {
                this.lastName = lastName;
            }
            System.out.print("Enter persons birth year: ");
            birthYear = sc.nextInt();
            sc.nextLine();
            if (birthYear > LocalDate.now().getYear()) {
                System.out.println("Invalid input");
            } else {
                this.birthYear = birthYear;
            }
        }

        public void output() {
            System.out.println("Info about " + this.firstName + ":");
            System.out.println("First Name: " + this.firstName);
            System.out.println("Last Name: " + this.lastName);
            System.out.println("Birth Year: " + this.birthYear);
        }

        public void changeName(String name) {
            if (name == null || name.trim().isEmpty()) {
                System.out.println("Invalid input");
            } else {
                System.out.print("Are you trying to change first or last name? (fn, ln): ");
                switch (sc.next()) {
                    case "fn":
                        sc.nextLine();
                        this.firstName = name;
                        break;
                    case "ln":
                        sc.nextLine();
                        this.lastName = name;
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }

        }

        public void changeName(String firstName, String lastName) {
            if (firstName == null || lastName == null || firstName.trim().isEmpty()) {
                System.out.println("Invalid input");
            } else {
                this.firstName = firstName;
                this.lastName = lastName;
            }
        }
    }

    public static void main(String[] args) {
        Person firstPerson = new Person("John", "Smith");
        Person secondPerson = new Person("Jane", "Doe");
        Person thirdPerson = new Person("Mykola", "Parasyuk");
        Person fourthPerson = new Person();

        firstPerson.output();
        System.out.println(firstPerson.getAge());
        firstPerson.input();
        firstPerson.output();
        System.out.println(firstPerson.getAge());
        firstPerson.changeName("Dmitro");
        firstPerson.output();
        secondPerson.output();
        fourthPerson.output();
        fourthPerson.input();
        fourthPerson.output();

    }
}
