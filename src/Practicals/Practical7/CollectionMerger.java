package Practicals.Practical7;

import java.util.*;

class CollectionMerger {

    public static List<String> mergeAndSortLists(List<String> list1, List<String> list2) {
        List<String> combined = new ArrayList<>();
        if (list1 != null) {
            for (String s : list1) {
                if (s != null) combined.add(s);
            }
        }
        if (list2 != null) {
            for (String s : list2) {
                if (s != null) combined.add(s);
            }
        }

        Set<String> mergedSet = new TreeSet<>(combined);
        return new ArrayList<>(mergedSet);
    }
}
