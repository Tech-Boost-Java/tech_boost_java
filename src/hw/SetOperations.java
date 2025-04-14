package hw;
import java.util.*;

public class SetOperations {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        setA.add("apple");
        setA.add("banana");
        setA.add("cherry");

        Set<String> setB = new HashSet<>();
        setB.add("banana");
        setB.add("dragonfruit");
        setB.add("elderberry");

        Set<String> unionSet = union(setA, setB);
        Set<String> intersectSet = intersect(setA, setB);

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectSet);
    }
}
