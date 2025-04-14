package hw;
import java.util.*;

public class PersonMapTask {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Shevchenko", "Orest");
        personMap.put("Ivanenko", "Anna");
        personMap.put("Petrenko", "Oleh");
        personMap.put("Kovalenko", "Olena");
        personMap.put("Tkachenko", "Orest");
        personMap.put("Babenko", "Mykola");
        personMap.put("Bondarenko", "Iryna");
        personMap.put("Kostyk", "Anna");
        personMap.put("Melnyk", "Petro");
        personMap.put("Hrytsenko", "Marta");

        System.out.println("Initial personMap: ");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + "-> " + entry.getValue());
        }

        Set<String> names = new HashSet<>();
        boolean hasDuplicates = false;
        for (String name : personMap.values()) {
            if (!names.add(name)) {
                hasDuplicates = true;
                break;
            }
        }

        if (hasDuplicates) {
            System.out.println("\nThere are at least two persons with the same first name.");
        }
        else {
            System.out.println("\nAll first names are unique");
        }

        String nameToRemove = "Orest";
        String keyToRemove = null;

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals(nameToRemove)) {
                keyToRemove = entry.getKey();
                break;
            }
        }

        if (keyToRemove != null) {
            personMap.remove(keyToRemove);
            System.out.println("\nRemoved the person with name \"" + nameToRemove + "\" (" + keyToRemove + ")");
        } else {
            System.out.println("\nNo person found with name \"" + nameToRemove + "\"");
        }

        System.out.println("\nUpdated personMap: ");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + "-> " + entry.getValue());
        }
    }
}
