package practicalTasks;

import java.util.Map;
import java.util.stream.Stream;

public class MyUtils1 {
    public Stream<String> nameList(Map<String, Stream<String>> map) {
        if (map == null) throw new NullPointerException();

        Map<String, String> seen = new java.util.HashMap<>();

        map.values().stream()
                .flatMap(s -> s)
                .filter(name -> name != null)
                .map(name -> name.replaceAll("\\s+", ""))
                .filter(name -> !name.isEmpty())
                .forEach(name -> {
                    String key = name.toLowerCase();
                    String normalized = name.substring(0, 1).toUpperCase() +
                            name.substring(1).toLowerCase();
                    if (!seen.containsKey(key)) {
                        seen.put(key, normalized);
                    }
                });

        return seen.values().stream().sorted();
    }
}
