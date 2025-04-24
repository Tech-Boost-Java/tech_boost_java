package stream;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> notEmpty = Optional.of("Hello");
        Optional<String> empty = Optional.empty();
        Optional<String> nullValue = Optional.ofNullable(null);

        System.out.println("notEmpty: " + notEmpty);
        System.out.println("empty: " + empty);
        System.out.println("nullValue: " + nullValue);

        System.out.println("notEmpty.isPresent(): " + notEmpty.isPresent());
        System.out.println("empty.isPresent(): " + empty.isPresent());
        System.out.println("nullValue.isPresent(): " + nullValue.isPresent());

    }
}
