package oop.inheritance;
/**
 * Shape class
 * This class demonstrates inheritance in Java
 * Here, Circle, Rectangle, and Triangle classes inherit from Shape class
 * Shape class is a parent class
 * Circle, Rectangle, and Triangle classes are child classes
 *
 */

public class Shape {
    protected String name;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public double calculateArea() {
        return 0;
    }

    public String getName() {
        return name;
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("Circle", 5);
        shapes[1] = new Rectangle("Rectangle", 5, 10);
        shapes[2] = new Triangle("Triangle", 5, 10);

        for (Shape shape : shapes) {
            System.out.println("Area of " +
                    shape.getName() + " is " + shape.calculateArea()
            );
        }
    }
}