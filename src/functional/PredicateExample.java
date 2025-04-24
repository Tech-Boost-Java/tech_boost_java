package functional;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4)); // true
        System.out.println("Is 5 even? " + isEven.test(5)); // false

        IntPredicate isEvenInt = number -> number % 2 == 0;

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            if (isEvenInt.test(number)) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }
    }
}
