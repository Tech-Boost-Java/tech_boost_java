package oop;

public class Util {
    public static void print(String message, Object... args) {
        System.out.println(message);
        for (Object obj : args) {
            System.out.println(obj);
        }
    }
}
class UtilDemo {
    public static void main(String[] args) {
        Util.print("Hello World", 1, 2, 3, false);
    }
}
