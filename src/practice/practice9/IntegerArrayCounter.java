package practice.practice9;

import java.util.function.Predicate;

public class IntegerArrayCounter {
    public static int count(Integer[] array, Predicate<Integer> condition) {
        int counter = 0;
        for (Integer number : array) {
            if (condition.test(number)) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 3, 10};
        System.out.println("Numbers greater than 7: " + count(nums, n -> n > 7));
        System.out.println("Odd numbers: " + count(nums, n -> n % 2 != 0));
        System.out.println("Numbers equal to 3: " + count(nums, n -> n == 3));
    }
}
