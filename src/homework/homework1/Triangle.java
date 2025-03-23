package homework.homework1;

import static java.lang.Math.sqrt;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.round(sqrt(p*(p-a)*(p-b)*(p-c)) * 100.0) / 100.0;
    }
}
