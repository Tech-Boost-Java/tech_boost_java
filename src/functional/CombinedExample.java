package functional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CombinedExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Function<Integer, String> numberToString = number -> "Number: " + number;
        Consumer<String> printInfo = text -> System.out.println("Consumer: " + text);

        numbers.stream()
                .filter(isEven)
                .map(numberToString)
                .forEach(printInfo);
    }
}
