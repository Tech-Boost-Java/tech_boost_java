import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getBirthYear() {
        return birthYear;
    }
    private int getAge(){
        int currentYear = LocalDate.now().getYear();
        int birthYear = getBirthYear();
        return currentYear-birthYear;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();
        this.setFirstName(firstName);
        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();
        this.setLastName(lastName);
        boolean isChecked = false;
        while (!isChecked) {
            try {
                System.out.println("Enter birth year: ");
                int birthYear = sc.nextInt();
                if (birthYear <= 0 || birthYear > currentYear) {
                    throw new NumberFormatException("Please enter a valid birth year!");
                }
                this.setBirthYear(birthYear);
                isChecked = true;
            } catch (Exception e) {
                if (e.getClass() == NumberFormatException.class) {
                    System.out.println(e.getMessage());
                } else {
                    System.out.println("Enter integer value!");
                }
            }
            sc.nextLine();
        }
        sc.close();
    }
    public void output(){
        System.out.println("\nInformation about person:");
        System.out.println("First name: " + this.getFirstName());
        System.out.println("Last name: " + this.getLastName());
        System.out.println("Birth year: " + this.getBirthYear());
        System.out.println("Age: " + this.getAge());
    }
    public void changeName(String ...info) {
        String fn =  info[0];
        String ln = info[1];
        if (info.length > 2) {
            throw new NumberFormatException("More than 2 parameters are not allowed!");
        }
        if (!fn.isEmpty()) {
            this.setFirstName(fn);
        }
        if (!ln.isEmpty()) {
            this.setLastName(ln);
        }
    }
}
