import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public Person(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }



public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = in.nextLine();
        setFirstName(firstName);
        System.out.print("Enter the last name: ");
        String lastName = in.nextLine();
        setLastName(lastName);
        System.out.print("Enter the birth year: ");
        int birthYear = in.nextInt();
        setBirthYear(birthYear);
}

    public int getAge(){
        return 2025-getBirthYear();
    }

    public void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
    }
}
