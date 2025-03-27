package oop;

public class MethodsOverloading {

    public void printMessage() {
        System.out.println("Hello, from printMessage() method");
    }
    //Will be Compilation error, because the method is already defined
//    public String printMessage() {
//        return "Hello, from printMessage() method";
//    }

    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public void printMessage(String message, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Message: " + message);
        }
    }

}

class MethodsOverloadingDemo {
    public static void main(String[] args) {
        MethodsOverloading methodsOverloading = new MethodsOverloading();
        methodsOverloading.printMessage();
        methodsOverloading.printMessage("Hello, from printMessage(String message) method");
        methodsOverloading.printMessage("Hello, from printMessage(String message, int number) method", 3);
    }
}
