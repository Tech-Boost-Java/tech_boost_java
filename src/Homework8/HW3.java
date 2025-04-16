package Homework8;

public class HW3 {
    public static String highYear(int year) {
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return " is a leap year";
        }
        else{
            return " is not a leap year";
        }
    }

    public static void main(String[] args) {
        int year = 2024;

        System.out.println(year + highYear(year));
    }
}
