package functional;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printInfo = text -> System.out.println("Consumer: " + text);

        printInfo.accept("Hello, World!");

        List<String> list = List.of("Java", "Python", "JavaScript");
        list.forEach(printInfo);

    }

}
