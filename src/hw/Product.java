package hw;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {
    public String category;
    public LocalDate dateOfManufacture;
    public int price;

    public Product(String category, LocalDate dateOfManufacture, int price) {
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    @Override
    public String toString() {
        return category + ", " + dateOfManufacture + ", " + price;
    }

    static class Employee {
        public String name;

        public Employee(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .map(e -> e.name)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
