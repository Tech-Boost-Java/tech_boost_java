package oop.inheritance.abstractclass;

import java.util.Objects;

/**
 * Shape class
 * This class demonstrates abstract class in Java
 * Here, Shape class is an abstract class
 * Circle, Rectangle, Triangle classes are derived from Shape class
 */
public abstract class Shape {
    protected String name;

    protected Shape(String name) {
        this.name = name;
    }

    /**
     * Calculates the area of the shape
     *
     * @return the area of the shape
     */
    public abstract double calculateArea();

    public String getName() {
        return name;
    }

    /**
     * Prints the message
     *
     * @param message
     * @return message as string
     */
    public String printMessage(String message) {
        return message;
    }
}

/**
 * Circle class
 * This class demonstrates inheritance in Java
 * Here, Circle class is derived from Shape class
 */
class Circle extends Shape {
    private final double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle
     *
     * @return the area of the circle
     * formula: PI * radius * radius
     */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}

/**
 * Rectangle class
 * This class demonstrates inheritance in Java
 * Here, Rectangle class is derived from Shape class
 */
class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle
     *
     * @return the area of the rectangle
     * formula: width * height
     */
    @Override
    public double calculateArea() {
        return width * height;
    }
}

/**
 * Triangle class
 * This class demonstrates inheritance in Java
 * Here, Triangle class is derived from Shape class
 */
class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(base, triangle.base) == 0 && Double.compare(height, triangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }

    /**
     * Calculates the area of the triangle
     *
     * @return the area of the triangle
     * formula: 0.5 * base * height
     */
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

/**
 * ShapeDemo class
 * Here, ShapeDemo class is the main class
 */
class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle("Circle", 5),
                new Rectangle("Rectangle", 5, 10),
                new Triangle("Triangle", 5, 10)
        };

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getName() + " is " + shape.calculateArea());
            System.out.println(shape.printMessage("This is a message from " + shape.getName()));
        }

        Shape circle = new Circle("Circle", 7.5);
        Shape shape = (Circle) circle;//in this case, downcasting is not necessary
        Circle circle1 = (Circle) circle;//in this case, downcasting is necessary

        System.out.println(shape.printMessage("Area of " + shape.getName() + " is " + shape.calculateArea()));
        System.out.println(circle1.printMessage("Area of " + circle1.getName() + " is " + circle1.calculateArea()));

    }
}