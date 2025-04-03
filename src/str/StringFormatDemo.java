package str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFormatDemo {
    public static void main(String[] args) {
        String name = "John";
        int age = 25;
        double salary = 1000.918561548454;

        //Formatting

        //first way
        String formatted = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
        System.out.println(formatted);

        //second way
        System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);
        System.out.println("-".repeat(10));

        //Formatting numbers
        System.out.printf("Number: %10d%n", 123);//right-justified, 10 characters
            System.out.printf("Number: %-10d%n", 123);//left-justified, 10 characters
        System.out.printf("Number: %010d%n", 123);//zero padding
        System.out.printf("Number: %+d%n", 123);//show sign

        //Multiple arguments in format method and using the same argument multiple times
        String result = String.format("Name: %1$s, Again name: %1$s, Age: %2$d", "John", 25);
        System.out.println(result);

        //Table formatting
        String header = String.format("%-10s | %-5s | %-10s%n", "Name", "Age", "Salary");
        String row1 = String.format("%-10s | %-5d | %-10.2f%n", "John", 25, 1000.918);
        String row2 = String.format("%-10s | %-5d | %-10.2f%n", "Jane", 30, 2000.918);

        System.out.println(header + row1 + row2);

        //Using dynamic width
        String[] names = {"John", "Anna-Maria", "Jane"};

        int maxLength = 0;

        for (String users : names) {
            if (users.length() > maxLength) {
                maxLength = users.length();
            }
        }
        System.out.printf("%-" + maxLength + "s | %5s%n", "Name", "Age");//- for left-justified
        for (String users : names) {
            System.out.printf("%-" + maxLength + "s | %5d%n", users, 25);
        }


    }
}
