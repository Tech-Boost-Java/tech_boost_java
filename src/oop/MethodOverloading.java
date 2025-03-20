package oop;

public class MethodOverloading {

    public void printMessage() {
        System.out.println("Hello from printMessage() method");
    }
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }
    public void printMessage(String message, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Message: " + message);
        }
    }
}


