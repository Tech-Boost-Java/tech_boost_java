package practice.practice8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSorter {
    public static void sortStrings(List<String> strings) {
        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));
    }

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "Apple", "cherry", "apple");
        sortStrings(fruits);
        fruits.forEach(System.out::println);
    }
}
