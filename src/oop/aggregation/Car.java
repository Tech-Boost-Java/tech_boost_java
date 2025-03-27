package oop.aggregation;

/**
 * Car class
 * This class demonstrates an aggregation in Java
 * Class Wheel is "independent" part
 */
public class Car {
   private final Wheel wheel;

    public Car(Wheel wheel) {
        this.wheel = wheel;
    }

    void move() {
        wheel.rotate();
        System.out.println("Car is moving");
    }
    void stop() {
        wheel.stop();
        System.out.println("Car is stopped");
    }

    public int getCountOfDoors() {
        return wheel.getCountOfDoors();
    }
}