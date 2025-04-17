package Practicals.Practical9;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyUtils {
    public Stream<String> nameList(Map<String, Stream<String>> map) {
        return map.values().stream()
                .flatMap(stream -> stream)
                .filter(name -> name != null && !name.trim().isEmpty())
                .map(String::trim)
                .map(String::toLowerCase)
                .distinct()
                .map(name -> name.replaceAll("\\s+", ""))
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .sorted();
    }

    public int sumEven(Stream<IntStream> stream) {
        return stream.mapToInt(intStream -> intStream.filter(i -> i > 0 && i % 2 == 0)
                .min()
                .orElse(0))
                .sum();
     }

    public Stream<Integer> duplicateElements(Stream<Integer> stream) {
        Set<Integer> seenOnce = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        stream.forEach(num -> {
            if (!seenOnce.add(num)) {
                duplicates.add(num);
            }
        });

        return duplicates.stream().sorted();
    }


    public static void main(String[] args) {
        MyUtils utils = new MyUtils();

        Map<String, Stream<String>> map = Map.of(
                "Desktop", Stream.of("iVan", "PeTro ", " Ira"),
                "Web", Stream.of("STepan", "ira ", " Andriy ", "an na"),
                "Spring", Stream.of("Ivan", "Anna")

        );

        System.out.println("Normalized and sorted names:");
        utils.nameList(map).forEach(System.out::println);
    }
}

