package lesson2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String dayWeek[]= new String[7];
        String[] month;
        month = new String[12];

        int[] monthDays1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
        int[] monthDays2 = new int[12];
        monthDays2[0] = 31;
        monthDays2[1] = 28;
// . . .
        monthDays2[11] = 31;
        int n = monthDays2.length; // n = 12

        System.out.println(Arrays.toString(monthDays2)); // [I@659e0bfd

        char twod1[][]= new char[3][4];
        char[][] twod2= new char[3][4];
        double[][] m= { {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15} };
        int[][] twoD= new int[4][];
        twoD[0]= new int[5];
        twoD[1]= new int[2];
        twoD[2]= new int[3];
        twoD[3]= new int[7];
        int[][] irregular={{1},{2,3,4},{5},{6,7}};
    }
}

