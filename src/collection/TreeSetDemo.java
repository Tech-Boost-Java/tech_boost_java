package collection;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        Comparator<String> nullAllowValue = Comparator.nullsLast(Comparator.naturalOrder());
       // Comparator<String> nullAllowValue = Comparator.nullsFirst(String::compareTo);
        Set<String> set = new TreeSet<>(nullAllowValue);
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add(null);

        System.out.println(set);


        Set<String> names = new HashSet<>(Set.of("John", "Jane", "Jack", "Jill"));
        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames, Comparator.naturalOrder());
        sortedNames.forEach(System.out::println);
    }
}
