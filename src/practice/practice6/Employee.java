package practice.practice6;

import homework.homework9.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "James");
        employeeMap.put(6, "Bob");
        employeeMap.put(2, "John");
        employeeMap.put(3, "Jack");
        employeeMap.put(4, "Mary");
        employeeMap.put(15, "Jane");
        employeeMap.put(7, "Jack");
        System.out.println(employeeMap);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        if (employeeMap.containsKey(id)) System.out.println(employeeMap.get(id));
        else System.out.println("Invalid ID");

        scanner.nextLine();
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (name.equals(entry.getValue())) {
                System.out.print(entry.getKey());
                break;
            }
        }
        if (!employeeMap.containsValue(name)) System.out.print("Invalid Employee");
    }
}
