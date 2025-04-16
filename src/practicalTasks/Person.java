package practicalTasks;

import java.util.ArrayList;
import java.util.List;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    DecisionMethod goShopping = (product, discount) ->
            product.equals("product1") && discount > 10;

    public static void main(String[] args) {
        Person z = new Person("Zlata");
        Person a = new Person("Alex");

        a.goShopping = (p, d) -> p.startsWith("product") && d >= 1;

        Shop shop = new Shop();
        shop.clients.add(z.goShopping);
        shop.clients.add(a.goShopping);

        System.out.println("Go shopping (product1, 15): " + shop.sale("product1", 15));
        System.out.println("Go shopping (product1, 5): " + shop.sale("product1", 5));
        System.out.println("Go shopping (milk, 20): " + shop.sale("milk", 20));
    }
}

interface DecisionMethod {
    boolean decide(String product, int discount);
}

class Shop {
    public List<DecisionMethod> clients = new ArrayList<>();

    public int sale(String product, int percent) {
        int count = 0;

        for (DecisionMethod d : clients) {
            if (d.decide(product, percent)) {
                count++;
            }
        }
        return count;
    }
}