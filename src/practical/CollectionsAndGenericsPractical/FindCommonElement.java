package practical.CollectionsAndGenericsPractical;

import java.util.*;

public class FindCommonElement {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(8);
        l1.add(10);

        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(9);

        List<Integer> o = findCommonElements(l1, l2);
        System.out.println(o + " " + findMaxValue(o));

        List<String> s1 = new ArrayList<>();
        s1.add("apple");
        s1.add("apple");
        s1.add("banana");

        List<String> s2 = new ArrayList<>();
        s2.add("banana");
        s2.add("cherry");
        s2.add("cherry");

        List<String> s3 = mergeAndSortLists(s1, s2);
        System.out.println(s3);

    }

    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> commonElements = new ArrayList<>();
        if (list1 == null || list2 == null) {
            return new ArrayList<>();
        }
        for (Integer i : list1) {
            if (list2.contains(i) && !commonElements.contains(i)) {
                commonElements.add(i);
            }
        }
        return commonElements;
    }

    public static Integer findMaxValue(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int max = 0;
        for (Integer i : list) {
            if (i > max) {
              max = i;  
            }
        }
        return max;
    }

    public static List<String> mergeAndSortLists(List<String> list1, List<String> list2) {
        if (list1 == null) {
            list1 = new ArrayList<>();
        }
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        for (String string : list1) {
           if (!list2.contains(string) && !res.contains(string)) {
               res.add(string);
           }
        }
        for (String string : list2) {
            if (!res.contains(string)) {
                res.add(string);
            }
        }
        Collections.sort(res);
        return res;
    }
}
