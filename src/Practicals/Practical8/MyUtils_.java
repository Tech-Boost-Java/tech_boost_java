package Practicals.Practical8;

import java.util.Arrays;
import java.util.function.Predicate;

public class MyUtils_ {

    public static int getCount(int[] array, Predicate<Integer> predicate  ) {
        int count = 0;
        for (int j : array) {
            if (predicate.test(j)) {
                count++;
            }
        }
        return count;
    }
}
