package Git_homework_1;

import java.util.Scanner;

public class TriangleArea {

    public static double consoleArea (){
        Scanner sc = new Scanner(System.in);
        double[] sides = new double[3];
        for (int i=0; i <sides.length; i++){
            System.out.print("Input Side " +(i+1));
            sides[i] = sc.nextDouble();
        }
        double perimetr = (sides[0]+sides[1]+sides[2])/2;
        double result = Math.sqrt(perimetr*(perimetr-sides[0])*(perimetr-sides[1])*(perimetr-sides[2]));
        return result;
    }
    public static void main(String[] args) {
        System.out.println(consoleArea());
        }
}
