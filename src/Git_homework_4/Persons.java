package Git_homework_4;

import java.util.*;

public class Persons {

    public static boolean sameFirstName(Map<String, String> map){
        for(String name : map.values()){
            if (Collections.frequency(map.values(), name) >= 2){
                return true;
            }
        }
        return false;
    }

    public static void name(Map<String, String> map,  String name){
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()){
            if (entry.getValue().equals(name)){
                keys.add(entry.getKey());
            }
        }
        for (String key : keys) {
            map.remove(key);
        }
    }

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<String, String>();
        String[] firstNames = {"Andrii", "Egor", "Kirill", "John", "Orest", "Mikola", "Grisha"};
        String[] lastNames = {"Johns", "Deer", "Felps", "Bosch", "Johnson", "Donaldson", "Tetcher", "Dick", "Hutcherson", "Havier"};
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            personMap.put(lastNames[i], firstNames[rand.nextInt(firstNames.length)]);
        }
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println((sameFirstName(personMap) ? "There are some people" : "There is not any people") + " with same first name\n");;

        name(personMap, "John");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
