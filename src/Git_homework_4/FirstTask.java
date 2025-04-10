package Git_homework_4;

import java.util.*;

public class FirstTask {

    public static <T> List union  (Set<T> set1, Set<T> set2){
        List<T> list = new ArrayList<T>();
        Iterator<T> iterator1 = set1.iterator();
        Iterator<T> iterator2 = set2.iterator();
        while (iterator1.hasNext() || iterator2.hasNext()){
            if (iterator1.hasNext()){
                list.add(iterator1.next());
            }
            if (iterator2.hasNext()){
                list.add(iterator2.next());
            }
        }
        return list;
    }

    public static <T> Set<T> intersect (Set<T> set1, Set<T> set2){
        Set<T> intersection = new HashSet<>();

        for (T elem : set1){
            if (set2.contains(elem)){
                intersection.add(elem);
            }
        }

        return intersection;
    }


    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 11, 3, 4, 5, 6, 7, 8, 9, 10));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 4, 5, 6, 7, 8, 9, 10));
        List union = union(set1, set2);
        Set intersection = intersect(set1, set2);
        System.out.println(union);
        System.out.println(intersection);
    }
}
