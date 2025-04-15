package homework_Collection_part2;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class FirstTask {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<T>();

        if (!Objects.isNull(set1))
            unionSet.addAll(set1);
        if (!Objects.isNull(set2))
            unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectSet = new HashSet<T>();

        if (!Objects.isNull(set1) && !Objects.isNull(set2))
            for (T element : set2) {
                if (set1.contains(element))
                    intersectSet.add(element);
            }

        return intersectSet;
    }

    public static void main(String[] args) {
        Set<Integer> integerSet1 = new HashSet<>(List.of(3, 4, 5, 6, 9));
        Set<Integer> integerSet2 = new HashSet<>(List.of(3, 4, 5, 6, 9));

        Set<Integer> unionSet1 = union(integerSet1, integerSet2);
        System.out.println("Union integer set: " + unionSet1);

        Set<Integer> intersectSet1 = intersect(integerSet1, integerSet2);
        System.out.println("Intersect integer set: " + intersectSet1);

        Set<String> stringSet1 = new HashSet<>(List.of("apple", "banana", "orange"));
        Set<String> stringSet2 = new HashSet<>(List.of("banana", "cherry"));

        Set<String> unionSet2 = union(stringSet1, stringSet2);
        System.out.println("\nUnion string set: " + unionSet2);

        Set<String> intersectSet2 = intersect(stringSet1, stringSet2);
        System.out.println("Intersect string set: " + intersectSet2);


    }

}
