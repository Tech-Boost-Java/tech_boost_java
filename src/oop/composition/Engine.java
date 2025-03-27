package oop.composition;

/**
 * Engine class
 * This class demonstrates composition in Java
 */
public class Engine {
    /**
     * Starts the engine
     */
    void start() {
        System.out.println("Engine started");
    }

    /**
     * Stops the engine
     */
    void stop() {
        System.out.println("Engine stopped");
    }

    /**
     * Returns the number of cylinders
     *
     * @return int
     */
    public int getNumberOfCylinders() {
        return 4;
    }

}

