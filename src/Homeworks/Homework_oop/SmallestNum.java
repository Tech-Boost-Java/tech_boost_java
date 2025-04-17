package Homeworks.Homework_oop;

import static java.lang.Math.min;

public class SmallestNum {
    public static double smallestNum(int a, int b, int c) {
        return min(min(a, b), c);
    }
}
