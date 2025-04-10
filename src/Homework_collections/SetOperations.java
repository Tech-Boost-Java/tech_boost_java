package Homework_collections;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<T>(set1);
        union.addAll(set2);
        return union;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersect = new HashSet<>();
        for (T t : set1) {
            if (set2.contains(t)) {
                intersect.add(t);
            }
        }
        return intersect;
    }

    public static void main(String[] args) {
        // Create and populate the first set
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        // Create and populate the second set
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // Print the original sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Test the union method
        Set<Integer> unionResult = union(set1, set2);
        System.out.println("Union: " + unionResult);

        // Test the intersection method
        Set<Integer> intersectionResult = intersect(set1, set2);
        System.out.println("Intersection: " + intersectionResult);

        // Additional test with String sets
        Set<String> stringSet1 = new HashSet<>();
        stringSet1.add("apple");
        stringSet1.add("banana");
        stringSet1.add("cherry");

        Set<String> stringSet2 = new HashSet<>();
        stringSet2.add("banana");
        stringSet2.add("cherry");
        stringSet2.add("date");

        System.out.println("\nString Set 1: " + stringSet1);
        System.out.println("String Set 2: " + stringSet2);

        Set<String> stringUnion = union(stringSet1, stringSet2);
        System.out.println("String Union: " + stringUnion);

        Set<String> stringIntersection = intersect(stringSet1, stringSet2);
        System.out.println("String Intersection: " + stringIntersection);
    }
}
