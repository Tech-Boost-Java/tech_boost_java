package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> filteredNumbers = numbers.stream()
                .filter(x -> x > 3)
                .toList(); // Collect results into a list

        System.out.println("Filtered numbers: " + filteredNumbers);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println("Name: " + name);
            }
        }
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
        // .toList();//error

        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(System.out::println);
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);


        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = numbers2.stream()
                .filter(
                        num -> {
                            System.out.println("Filtering1: " + num);
                            return num > 3;
                        }
                );
        stream2.forEach(System.out::println);
        List<String> strings = Stream.of("abc", "   ", "bc", "abcd", "   ", "jkl").toList();
        List<String> filtered = strings.stream().
                filter(string -> !string.isEmpty())// isBlank
                //.collect(Collectors.toList());
                .toList();
        System.out.println(filtered);
        System.out.println(strings);

        List<String> strings1 = Arrays.asList("abc", "", "eg", "abcd", "", "jkl");
        // get count of empty string
        long count = strings1.stream()
                .filter(string -> string.isEmpty())
                .count();
        System.out.println(count);

    }
}
