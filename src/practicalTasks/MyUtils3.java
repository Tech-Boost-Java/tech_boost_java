package practicalTasks;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

public class MyUtils3 {
    public Stream<Integer> duplicateElements(Stream<Integer> stream) {
        return stream
                .filter(x -> x != null)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .sorted();
    }
}

