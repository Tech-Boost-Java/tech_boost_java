package collection;

public class MyClass<T> {
    static <T> void printInfo(T t){
        System.out.println("Type: " + t.getClass().getName());
    }

    public static void main(String[] args) {
        MyClass.printInfo("Hello");
        MyClass.printInfo(123);
        MyClass.printInfo(12.34);
    }
}
