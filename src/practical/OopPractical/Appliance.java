package practical.OopPractical;

public abstract class Appliance {
    String brand;
    String model;

    public Appliance (String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    abstract void displayInfo();
}

class WashingMachine extends Appliance {
    int loadCapacity;

    public WashingMachine (String brand, String model, int loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.printf("Washing Machine - Brand: %s, Model: %s, Load Capacity: %d kg\n", brand, model, loadCapacity);
    }
}

class Refrigerator extends Appliance {
    int capacity;

    public Refrigerator (String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    @Override
    void displayInfo() {
        System.out.printf("Refrigerator - Brand: %s, Model: %s, Capacity: %d liters\n", brand, model, capacity);
    }
}