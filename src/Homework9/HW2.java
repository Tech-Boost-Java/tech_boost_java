package Homework9;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HW2 {
    static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Raq"),
                new Employee("Sam")

        );
        Map<String, Long> Counts = employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<String> popular = Counts.entrySet()
                        .stream()
                        .filter(e -> Collections.frequency(Counts.values(), e.getValue()) == 1)
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey);

        System.out.println(popular.orElse("All are equals"));
    }
}
