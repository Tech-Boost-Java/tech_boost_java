package practical.StreamAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI_practical {
    public static void main(String[] args) {
        Map<String, Stream<String>> input = new HashMap<>();
        input.put("Desktop", Stream.of(" iVan", "PeTro ", " Ira "));
        input.put("Web", Stream.of("STepan", "ira ", " Andriy ", "an na"));
        input.put("Spring", Stream.of("Ivan", "Anna"));

        nameList(input).forEach(System.out::println);

        Stream<IntStream> input2 = Stream.of(
                IntStream.of(-2, -4, 1, 8, 3, 10),
                IntStream.of(2, -4, 4, 0, 3, 1),
                IntStream.of(1, -4, 3, 5, 3, 1)
        );
        System.out.println("\n" + sumEven(input2) + "\n");

        Stream<Integer> input3 = Stream.of(1, 2, 3, 2, 4, 5, 1, null, 3, 1, 4, -1, -1);
        duplicateElements(input3).forEach(System.out::println);
    }
    public static Stream<String> nameList(Map<String, Stream<String>> map) {
        if (map == null) {
            throw new NullPointerException();
        }

        return map.values().stream()
                .filter(Objects::nonNull)
                .flatMap(s -> s)
                .filter(Objects::nonNull)
                .map(s -> s.trim().replaceAll("\\s+", ""))
                .filter(s -> !s.isEmpty())
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                .collect(Collectors.toMap(
                        s -> s.toLowerCase(),
                        s -> s,
                        (existing, replacement) -> existing
                ))
                .values().stream()
                .sorted();
    }

    static int sumEven(Stream<IntStream> stream) {
        return stream.mapToInt(inner -> inner.filter(x -> x > 0 && x % 2 == 0).min().orElse(0)).sum();
    }

    public static Stream<Integer> duplicateElements(Stream<Integer> stream) {
        return stream.filter(Objects::nonNull).sorted()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey);
    }
}
