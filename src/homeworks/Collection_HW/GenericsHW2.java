package homeworks.Collection_HW;

import java.util.*;

public class GenericsHW2 {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Smith", "John");
        personMap.put("Johnson", "Emily");
        personMap.put("Williams", "James");
        personMap.put("Jones", "Sarah");
        personMap.put("Brown", "John");
        personMap.put("Davis", "Sophia");
        personMap.put("Miller", "David");
        personMap.put("Wilson", "Olivia");
        personMap.put("Moore", "Orest");
        personMap.put("Taylor", "Isabella");

        Set<String> firstNames = new HashSet<>(personMap.values());
        boolean hasDuplicates = firstNames.size() != personMap.size();
        System.out.println("\nAre there at least two persons with the same first name? " + hasDuplicates);

        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals("Orest")) {
                iterator.remove();
            }
        }

        System.out.println("\nMap after removal");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.printf("%-10s %-10s%n", entry.getKey(), entry.getValue());
        }
    }
}

/*
Create a map called personMap and populate it with ten entries of type <String,
String>, where each entry corresponds to a person's last name and first name. Display
the contents of the map on the screen. Are there at least two persons with the same
first name among these ten people? Remove the person from the map whose first
name is "Orest" (or any other specified name). Print the resulting map after the
removal.
 */