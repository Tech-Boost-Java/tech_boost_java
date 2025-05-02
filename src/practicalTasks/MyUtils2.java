package practicalTasks;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyUtils2 {
    public int sumEven(Stream<IntStream> stream) {
        return stream
                .mapToInt(s -> s
                        .filter(n -> n > 0 && n % 2 == 0)
                        .min()
                        .orElse(0)
                )
                .sum();
    }
}
