package functional.ref;

import java.util.function.Function;

public class StaticMethodRefExample {

    public static void main(String[] args) {

        Function<String, Integer> parseInt = text -> Integer.parseInt(text);
        Function<String, Integer> stringToInteger = Integer::parseInt;

        String[] numbers = {"1", "2", "3", "4", "5"};
        for (String number : numbers) {
            int result = stringToInteger.apply(number);
            System.out.println("Parsed using ref: " + result);
        }
    }
}
