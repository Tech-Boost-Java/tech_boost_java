package practice.practice3;

import java.util.ArrayList;

public class HeavyBox {
    int weight;
    String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public String toString() {
        return "HeavyBox [weight=" + weight + ", contents=" + contents + "]";
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<HeavyBox>();

        heavyBoxes.add(new HeavyBox(10, "Hello World"));
        heavyBoxes.add(new HeavyBox(20, "Hello Mars"));
        heavyBoxes.add(new HeavyBox(30, "Hello Saturn"));

        heavyBoxes.getFirst().weight += 1;
        heavyBoxes.removeLast();

        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox);
        }

        heavyBoxes.clear();
        System.out.println("Boxes after clear: " + heavyBoxes);
    }
}
