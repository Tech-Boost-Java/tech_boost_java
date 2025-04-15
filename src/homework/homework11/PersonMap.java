package homework.homework11;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Udov", "Albert");
        personMap.put("Johnson", "Bernard");
        personMap.put("Mich", "Orest");
        personMap.put("Orch", "John");
        personMap.put("Ondro", "Jane");
        personMap.put("Jahn", "Donald");
        personMap.put("Joe", "Igor");
        personMap.put("Zodva", "Orest");
        personMap.put("Kirh", "Ada");
        personMap.put("Lodoch", "Lina");
        System.out.println(personMap);

        personMap.values().removeIf(firstName -> firstName.equals("Orest"));
        System.out.println(personMap);
    }
}
