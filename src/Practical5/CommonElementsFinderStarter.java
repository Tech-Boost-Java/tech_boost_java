package Practical5;

import java.util.ArrayList;
import java.util.List;

class CommonElementsFinderStarter {

    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> intersect = new ArrayList<>();
        if (list1 == null || list2 == null) {
            return intersect;
        }

        for (Integer v : list1) {
            if (list2.contains(v) && !intersect.contains(v)) {
                intersect.add(v);
            }
        }
        return intersect;
    }

    public static Integer findMaxValue(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        List<Integer> mutableList = new ArrayList<>(list);
        mutableList.sort(Integer::compareTo);
        return mutableList.get(mutableList.size() - 1);
    }

    public static void main(String[] args) {
        // Example lists to be used
        List<Integer> list1 = List.of(1, 2, 3, 5, 7, 8, 10);
        List<Integer> list2 = List.of(2, 3, 4, 5, 9);

        List<Integer> commonElements = findCommonElements(list1, list2);
        System.out.println("Common elements: " + commonElements);

        Integer maxValue = findMaxValue(commonElements);
        if (maxValue != null) {
            System.out.println("Maximum value among common elements: " + maxValue);
        } else {
            System.out.println("No common elements to determine the maximum value.");
        }
    }
}

