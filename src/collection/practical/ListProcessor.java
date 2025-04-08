package collection.practical;

import java.util.ArrayList;
import java.util.List;

public class ListProcessor<T> {
    private List<T> list;

    public ListProcessor() {
        this.list = new ArrayList<>();
    }

    public void addElement(T element) {
        list.add(element);
    }
    public <U extends Comparable<U>> T findMax(Class<U> clazz) {
        if (list.isEmpty()) {
            return null;
        }

        T maxElement = list.get(0);
        for (T element : list) {
            if (clazz.isInstance(element)) {
                U currentElement = clazz.cast(element);
                U maxElementValue = clazz.cast(maxElement);
                if (currentElement.compareTo(maxElementValue) > 0) {
                    maxElement = element;
                }
            }
        }
        return maxElement;
    }

    public List<T> filterGreaterThanTen() {
        List<T> result = new ArrayList<>();
        for(T element : list) {
            if (element instanceof Integer && (Integer) element > 10) {
                result.add(element);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

class ListProcessorDemo {
    public static void main(String[] args) {
        ListProcessor<Integer> integerListProcessor = new ListProcessor<>();
        integerListProcessor.addElement(5);
        integerListProcessor.addElement(15);
        integerListProcessor.addElement(10);
        integerListProcessor.addElement(20);

        System.out.println("Max Element: " + integerListProcessor.findMax(Integer.class));
        System.out.println("Elements greater than 10: " + integerListProcessor.filterGreaterThanTen());

        ListProcessor<String> stringListProcessor = new ListProcessor<>();
        stringListProcessor.addElement("Apple");
        stringListProcessor.addElement("Banana");
        stringListProcessor.addElement("Cherry");

        System.out.println("Max Element: " + stringListProcessor.findMax(String.class));

    }
}
