package homeworks.Collection_HW;

import java.util.HashSet;
import java.util.Set;

public class GenericsHW1 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> unionResult = union(set1, set2);
        System.out.println("Union (Integer): " + unionResult);
        Set<Integer> intersectionResult = intersect(set1, set2);
        System.out.println("Intersection (Integer): " + intersectionResult);

        Set<String> stringSet1 = new HashSet<>();
        stringSet1.add("apple");
        stringSet1.add("banana");
        stringSet1.add("cherry");
        Set<String> stringSet2 = new HashSet<>();
        stringSet2.add("banana");
        stringSet2.add("cherry");
        stringSet2.add("coconut");

        Set<String> stringUnionResult = union(stringSet1, stringSet2);
        System.out.println("\nUnion (String): " + stringUnionResult);

        Set<String> stringIntersectionResult = intersect(stringSet1, stringSet2);
        System.out.println("Intersection (String): " + stringIntersectionResult);

    }

    public static <T> Set<T> union (Set<T> set1, Set<T> set2) {
            Set<T> result = new HashSet<>(set1);
            result.addAll(set2);
            return result;
    }

    public static <T> Set<T> intersect (Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}


/*
Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set
set2), realizing the operations of union and intersection of two sets. Test the operation
of these techniques on two pre-filled sets
 */
