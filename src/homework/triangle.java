package homework;
import java.util.Scanner;
public class triangle {
    double triArea(double a, double b, double c){
        return Math.sqrt((a+b+c)/2*((a+b+c)/2 - a)* ((a+b+c)/2 - b) * ((a+b+c)/2 - c));
    }
    public static void main( String[] args ){
        triangle triangels = new triangle();
        Scanner f = new Scanner(System.in);
        System.out.print("Enter number: ");
        double a = f.nextDouble();
        System.out.print("Enter number: ");
        double b = f.nextDouble();
        System.out.print("Enter number: ");
        double c = f.nextDouble();
        triangels.triArea(a, b, c);
        System.out.print("Result: " + triangels.triArea(a, b ,c));
    }
}
