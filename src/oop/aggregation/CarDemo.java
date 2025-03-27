package oop.aggregation;

public class CarDemo {
    public static void main(String[] args) {
        Wheel wheel = new Wheel();
        Car car = new Car(wheel);
        car.move();
        car.stop();
        System.out.println("Count of doors: " + car.getCountOfDoors());
    }
}