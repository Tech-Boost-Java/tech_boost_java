package homework.hw4_CollectionsandGenericsPart2;

import java.util.*;

public class task2 {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Petrenko", "Ivan");
        personMap.put("Bondar", "Andriy");
        personMap.put("Melnyk", "Orest");

        System.out.println("Initial Map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        Set<String> seenFirstNames = new HashSet<>();
        boolean hasDuplicateFirstNames = false;

        for (String firstName : personMap.values()) {
            if (!seenFirstNames.add(firstName)) {
                hasDuplicateFirstNames = true;
                break;
            }
        }

        if (hasDuplicateFirstNames) {
            System.out.println("There are at least two people with the same first name.");
        } else {
            System.out.println("All first names are unique.");
        }

        personMap.entrySet().removeIf(entry -> entry.getValue().equals("Orest"));

        System.out.println("Map after removing people with first name 'Orest':");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
