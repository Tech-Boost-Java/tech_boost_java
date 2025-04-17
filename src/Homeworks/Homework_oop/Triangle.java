package Homeworks.Homework_oop;

import static java.lang.Math.sqrt;

public class Triangle {
    public static double area_of_triangle(int a, int b, int c) {
        double semi_perimetr = (a + b + c) / 2.0;
        return sqrt(semi_perimetr * (semi_perimetr - a) * (semi_perimetr - b) * (semi_perimetr - c));
    }
}
