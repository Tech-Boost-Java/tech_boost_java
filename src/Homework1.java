import static java.lang.Math.sqrt;

public class Homework1 {
    public static double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args) {
        double area = calculateArea(3, 4, 5);

        System.out.println(area);
    }
}
