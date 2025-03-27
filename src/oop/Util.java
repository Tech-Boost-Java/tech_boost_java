package oop;

public class Util {
    public static void print(String message, Object... parameters) {
        System.out.println(message);
        for (Object obj : parameters) {
            System.out.println(obj);
        }
    }
}

class UtilDemo {
    public static void main(String[] args) {
        // Util util = new Util(); //Don't need to create an object to call a static method
        //Calling a static method
        Util.print("Hello", "Good afternoon", 1, 2, 3, false, 5.5);
    }
}
