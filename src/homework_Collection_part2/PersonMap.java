package homework_Collection_part2;

import java.util.*;

public class PersonMap {

    public static void printPersonMap(Map<String, String> map) {
        Set<String> LastNameSet = map.keySet();
        for (String lastName : LastNameSet) {
            String firstName = map.get(lastName);
            System.out.println("Last name: " + lastName + ", First name: " + firstName);
        }
    }

    public static boolean hasDuplicateFirstName(Map<String, String> map) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String firstName : map.values()) {
            countMap.put(firstName, countMap.getOrDefault(firstName, 0) + 1);
        }

        return countMap.values().stream().reduce(0, Integer::sum) > countMap.size();
    }

    public static void removeFirstByFirstName(Map<String, String> map, String firstName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstName)) {
                iterator.remove();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Shevchenko", "Taras");
        personMap.put("Franko", "Ivan");
        personMap.put("Khmelnytskyi", "Bohdan");
        personMap.put("Skovoroda", "Hryhorii");
        personMap.put("Bandera", "Stepan");
        personMap.put("Kotsiubynskyi", "Orest");

        System.out.println("Original person map:");
        printPersonMap(personMap);

        boolean hasDuplicates = hasDuplicateFirstName(personMap);
        System.out.println("\nHas duplicate first names? " + hasDuplicates);

        personMap.put("Chornovil", "Vyacheslav");
        personMap.put("Symonenko", "Vasyl");
        personMap.put("Stus", "Vasyl"); // duplicate first name
        personMap.put("Tkachuk", "Orest");

        System.out.println("\nModified person map:");
        printPersonMap(personMap);

        hasDuplicates = hasDuplicateFirstName(personMap);
        System.out.println("\nHas duplicate first names? " + hasDuplicates);

        String firstNameToRemove = "Orest";

        removeFirstByFirstName(personMap, firstNameToRemove);

        System.out.println("\nRemoving first element with first name \"" + firstNameToRemove + "\":\n");
        printPersonMap(personMap);
    }
}
