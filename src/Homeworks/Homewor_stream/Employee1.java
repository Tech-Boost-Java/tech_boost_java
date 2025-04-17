package Homeworks.Homewor_stream;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Homeworks.Homewor_stream.Employee1.mostPopularName;


public class Employee1 {
    static class Employee {
        String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        // Group by name and count occurrences
        Map<String, Long> nameCount = employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(
                        name -> name,
                        Collectors.counting()
                ));

        if (nameCount.isEmpty()) {
            return Optional.empty();
        }

        return nameCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}

class employeeDemo {
    public static void main(String[] args) {
        Employee1.Employee empl1 = new Employee1.Employee("Bob");
        Employee1.Employee empl2 = new Employee1.Employee("Din");
        Employee1.Employee empl3 = new Employee1.Employee("Sam");
        Employee1.Employee empl4 = new Employee1.Employee("Sam");

        Optional<String> result = mostPopularName(
                Stream.of(empl1, empl2, empl3, empl4)
        );

        System.out.println("Most popular name: " + result.orElse("None"));
    }
}
