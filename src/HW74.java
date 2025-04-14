import java.util.HashMap;
import java.util.Map;

public class HW74 {
    static Map<String, String> personMap(String[] surname, String[] name){
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < surname.length; i++){
            map.put(surname[i], name[i]);
        }
        return map;
    }
    public static void main(String[] args) {
        String[] surnames = {"Smith", "Johnson", "Brown", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin"};
        String[] names = {"James", "Emily", "Michael", "Sophia", "David", "Olivia", "Daniel", "Emma", "James", "Ava"};

        Map<String, String> personMap = personMap(surnames, names);
        System.out.println(personMap);

        personMap.remove("Smith");
        System.out.println(personMap);
    }
}
