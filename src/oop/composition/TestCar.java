package oop.composition;

class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car("Red", "Toyota", 2021);

        car.start();
        car.stop();
        System.out.println("Information about the car: ");
        System.out.println("Number of cylinders: " + car.getNumberOfCylinders()
                + "\nColor: " + car.getColor() //Color is null because we didn't set it
                + "\nModel: " + car.getModel() //Model is null because we didn't set it
                + "\nYear of Manufacture: " + car.getYearOfManufacture());//Year of Manufacture is 0 because we didn't set it

        car2.start();
        car2.stop();
        System.out.println("Information about the car2: ");
        System.out.println("Number of cylinders: " + car2.getNumberOfCylinders()
                + "\nColor: " + car2.getColor()
                + "\nModel: " + car2.getModel()
                + "\nYear of Manufacture: " + car2.getYearOfManufacture());
    }
}