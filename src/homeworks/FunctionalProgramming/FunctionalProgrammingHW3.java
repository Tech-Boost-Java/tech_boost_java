package homeworks.FunctionalProgramming;

import java.time.Year;

public class FunctionalProgrammingHW3 {
    public static void main(String[] args) {
        System.out.println(isLeap(2020));
        System.out.println(isLeap(1900));
        System.out.println(isLeap(2000));
        System.out.println(isLeap(2024));
        System.out.println(isLeap(2023));
    }

    public static boolean isLeap (int y) {
        return Year.isLeap(y);
    }
}

/*
3. Create a method that takes a year as a parameter and returns true if the year is a leap
year.
 */
