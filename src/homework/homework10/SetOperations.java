package homework.homework10;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("D");

        Set<String> set2 = new HashSet<>();
        set2.add("C");
        set2.add("G");
        set2.add("A");

        Set<String> unionRes = union(set1, set2);
        System.out.println(unionRes);

        Set<String> intersectionRes = intersection(set1, set2);
        System.out.println(intersectionRes);
    }
}
