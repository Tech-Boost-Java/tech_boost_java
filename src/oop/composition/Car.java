package oop.composition;

public class Car {
    private final Engine engine;
    private String color;
    private String model;
    private int yearOfManufacture;

    public Car() {
        engine = new Engine();
    }

    public Car(String color, String model, int yearOfManufacture) {
        engine = new Engine();
        this.color = color;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }


    void start() {
        engine.start();
        System.out.println("Car started");
    }

    void stop() {
        engine.stop();
        System.out.println("Car stopped");
    }

    public int getNumberOfCylinders() {
        return engine.getNumberOfCylinders();
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}
