package HW;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Side A of triangle: ");
        double SideA = in.nextInt();
        System.out.println("Enter Side B of triangle: ");
        double SideB = in.nextInt();
        System.out.println("Enter Side C of triangle: ");
        double SideC = in.nextInt();
        Triangles triangle = new Triangles(SideA,SideB,SideC);
        System.out.println(triangle.area());
    }
    public static class Triangles{
        private double sideA;
        private double sideB;
        private double sideC;

        public Triangles (double sideA, double sideB, double sideC) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        public double getSideA() {
            return sideA;
        }
        public double getSideB() {
            return sideB;
        }
        public double getSideC() {
            return sideC;
        }

        public void setSideA(double sideA) {
            this.sideA = sideA;
        }
        public void setSideB(double sideB) {
            this.sideB = sideB;
        }
        public void setSideC(double sideC) {
            this.sideC = sideC;
        }
        public double area(){
            double perimeter = (sideA+sideB+sideC)/2;
            double triangleArea = Math.sqrt(perimeter *(perimeter-sideA)*(perimeter-sideB)*(perimeter-sideC));
            return triangleArea;

        }
    }
}
