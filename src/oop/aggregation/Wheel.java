package oop.aggregation;

public class Wheel {
    /**
     * Rotates the wheel
     * @return void
     */
    void rotate() {
        System.out.println("Wheel is rotating");
    }

    /**
     * Stops the wheel
     * @return void
     */
    void stop() {
        System.out.println("Wheel is stopped");
    }

    /**
     * Returns count of doors
     * @return int
     */
    public int getCountOfDoors() {
        return 4;
    }

}



