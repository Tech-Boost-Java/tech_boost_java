import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HW73 {
    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> inter = new HashSet<>(set1);
        inter.retainAll(set2);
        return inter;
    }
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6));

        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersect(set1, set2));
    }
}
