package practicalTasks;

import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.ArrayList;
import java.util.List;

class MyUtilsFinal {
    public static int findMaxByCondition(List<Integer> numbers, Predicate<Integer> pr) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (pr.test(num) && num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        User u = new User();
        u.values.add(5);
        u.values.add(12);
        u.values.add(8);
        u.values.add(3);

        int result = u.getMaxValueByCondition(x -> x % 2 == 0);
        System.out.println(result);
    }
}

class User {
    public final List<Integer> values = new ArrayList<Integer>();

    int getFilterdValue(BiFunction<List<Integer>, Predicate<Integer>, Integer> func, Predicate<Integer> predicate) {
        return func.apply(values, predicate);
    }

    int getMaxValueByCondition(Predicate<Integer> predicate) {
        return getFilterdValue(MyUtilsFinal::findMaxByCondition, predicate);
    }
}
