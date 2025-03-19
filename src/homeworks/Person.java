package homeworks;

import java.time.LocalDate;

import java.util.Date;

public class Person {
    private String firstName, lastName;
    private int birthYear;

    public Person () {

    }
    public Person (String firstName, String lastName) {
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

    public void setlLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge (int birthYear) {
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }

    public void input (int birthYear) {
        this.birthYear = birthYear;
    }

    public String output () {
        return firstName + " " + lastName + " " + getAge(birthYear) + " years" ;
    }

    public void changeName(String fn, String ln) {
        if (fn != null && !fn.isEmpty() && ln == null) {
            this.firstName = fn;
        }
        else if (ln != null && !ln.isEmpty() && fn == null) {
            this.lastName = ln;
        }
        else if (fn != null && !fn.isEmpty() && ln != null && !ln.isEmpty()) {
            this.firstName = fn;
            this.lastName = ln;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

}
