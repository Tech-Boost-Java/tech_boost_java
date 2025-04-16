package practicalTasks;
import java.util.Arrays;
import java.util.function.Predicate;
public class MyUtils {
    public static int getCount(int[] array, Predicate<Integer> condition) {
        int count = 0;
        for (int num : array) {
            if (condition.test(num)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Predicate<Integer> isEven = x -> x % 2 == 0;

        int result = MyUtils.getCount(numbers, isEven);

        System.out.println("Count of even numbers: " + result); // Виведе: 5
    }
}
