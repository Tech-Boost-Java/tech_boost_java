package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toUnmodifiableList;

public class Example2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "eg", "abd", "", "jkl");
        List<String> filtered = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);

        String mergedString = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        System.out.println("*".repeat(20));
        List<String> list = Arrays.asList("Start", "Second", "Third", "Fourth");
        System.out.println("List: " + list);

        List<String> unmodifiableList = list.stream().collect(toUnmodifiableList());
        List<String> unmodifiableList1 = list.stream().toList(); // version Java 16
        unmodifiableList.add("last");
        unmodifiableList1.add("last"); // UnsupportedOperationException
        System.out.println("Unmodifiable List: " + unmodifiableList1);
    }
}
