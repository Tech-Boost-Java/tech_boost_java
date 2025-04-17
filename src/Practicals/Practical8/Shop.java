package Practicals.Practical8;

import java.util.ArrayList;
import java.util.List;

interface DecisionMethod {
    boolean decide(String productName, int discount);
}

class Person {
    String name;
    DecisionMethod goShopping;

    Person(String name) {
        this.name = name;
        // Write lambda here
        this.goShopping = (productName, discount) ->
                productName.equals("product1") && discount > 10;
    }
}

class Shop {
    public List<DecisionMethod> clients = new ArrayList<>();

    public int sale(String product, int percent) {
        int count = 0;
        for (DecisionMethod clientDecision : clients) {
            if (clientDecision.decide(product, percent)) {
                count++;
            }
        }
        return count;
    }
}
