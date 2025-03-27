package oop;

/**
 * MethodsOverloadingExample class
 * This class demonstrates method overloading in Java
 * Same method name with different parameters
 * The return type can be different
 * The access modifier can be different
 */
public class MethodsOverloadingExample {
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2L, 3L));
        System.out.println(sum(2.5, 3.5));
        System.out.println(sum(2, 3, 4));
    }

    public static int sum(int a, int b) {
        System.out.println("Method int sum(int a, int b)");
        return a + b;
    }

    public static double sum(double a, double b) {
        System.out.println("Method double sum(double a, double b)");
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("Method int sum(int a, int b, int c)");
        return a + b + c;
    }
    public static long sum(long a, long b) {
        System.out.println("Method long sum(long a, long b)");
        return a + b;
    }
}
