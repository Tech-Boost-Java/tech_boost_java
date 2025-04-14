package homework.hw6_StreamAPI;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.*;

public class task2 {

    static class Employee {
        String name;

        public Employee(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    static Optional<String> mostPopularName(@NotNull Stream<Employee> employees) {
        List<Employee> employeeList = employees.collect(Collectors.toList());

        System.out.println("Employees: ");
        employeeList.forEach(emp -> System.out.println("Employee's name: " + emp.getName()));

        return employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee("Bohdan"),
                new Employee("Max"),
                new Employee("Max"),
                new Employee("Artem")
        );

        Optional<String> result = mostPopularName(employeeList.stream());
        result.ifPresentOrElse(
                name -> System.out.println("The most popular name: " + name),
                () -> System.out.println("No employees.")
        );
    }
}