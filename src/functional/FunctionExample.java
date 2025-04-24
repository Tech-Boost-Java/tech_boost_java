package functional;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

public class FunctionExample {
    public static void main(String[] args) {
        // Using a lambda expression to define a function
        Function<Integer, Integer> square = x -> x * x;

        // Using the function
        int result = square.apply(5);
        System.out.println("The square of 5 is: " + result); // Output: The square of 5 is: 25

        Function<String, Integer> stringLength = str -> str.length();
        int length = stringLength.apply("Hello, World!");
        System.out.println("The length of 'Hello, World!' is: " + length); // Output: The length of 'Hello, World!' is: 13

        IntFunction numberToString = number -> String.valueOf(number);

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            String resultString = (String) numberToString.apply(number);
            System.out.println("The string representation of " + number + " is: " + resultString);
        }

      IntToDoubleFunction intToDoubleFunction = (int value) -> (double) value / 2;
        int[] intValues = {1, 2, 3, 4, 5};
        for (int value : intValues) {
            double resultDouble = intToDoubleFunction.applyAsDouble(value);
            System.out.println("The double representation of " + value + " is: " + resultDouble);
        }

    }
}
