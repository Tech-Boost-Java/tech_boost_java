package Homeworks.Homework_collections2;

import java.util.*;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Johnson", "Emma");
        personMap.put("Smith", "Liam");
        personMap.put("Williams", "Olivia");
        personMap.put("Brown", "Ava");
        personMap.put("Jones", "Ava");
        personMap.put("Garcia", "Elijah");
        personMap.put("Martinez", "Sophia");
        personMap.put("Miller", "James");
        personMap.put("Davis", "Isabella");
        personMap.put("Wilson", "Benjamin");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last name: " + entry.getKey() + ", First name: " + entry.getValue());
        }

        Collection<String> firstNames = personMap.values();
        Set<String> uniqueFirstNames = new HashSet<>();
        boolean hasDuplicateFirstNames = false;

        for (String firstName : firstNames) {
            if (!uniqueFirstNames.add(firstName)) {
                hasDuplicateFirstNames = true;
                System.out.println("\nThere are at least two persons with the same first name: " + firstName + "\n");
                break;
            }
        }

        if (!hasDuplicateFirstNames)
            System.out.println("\nThere aren't persons with the same first name.\n");


        personMap.remove("Barcia");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last name: " + entry.getKey() + ", First name: " + entry.getValue());
        }


    }
}
