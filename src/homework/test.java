package homework;

import java.util.ArrayList;
import java.util.List;

class CommonElementsFinderStarter {

    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> commonElements = new ArrayList<>();
        if(list1.isEmpty() && list2.isEmpty()){
            return commonElements;
        }
        else if(list1 != null && list2 != null){
            return null;
        }
        else {
            for (Integer num : list1) {
                if (list2.contains(num) && !commonElements.contains(num)) {
                    commonElements.add(num);
                }
            }
            return commonElements;
        }
    }

    public static Integer findMaxValue(List<Integer> list) {
        Integer maxVal = 0;
        if (list != null && list.isEmpty()) {
            for (Integer num : list) {
                if (num > maxVal) {
                    maxVal = num;
                }
            }
            return maxVal;

        }
        else {
            return null;
        }
    }
}