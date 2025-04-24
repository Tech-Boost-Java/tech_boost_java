package functional;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> increment = x -> x + 1;

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            int result = increment.apply(number);
            System.out.println("Incremented value of " + number + " is: " + result);
        }

        BinaryOperator<Integer> add = (x, y) -> x + y;
        int[][] pairs = {{1, 2}, {3, 4}, {5, 6}};
        for (int[] pair : pairs) {
            int result = add.apply(pair[0], pair[1]);
            System.out.println("Sum of " + pair[0] + " and " + pair[1] + " is: " + result);
        }

    }
}
