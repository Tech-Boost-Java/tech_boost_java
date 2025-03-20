package oop.inheritance;

public class Shape {
    protected String name;

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
        return Math.PI * radius * radius;

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
        return 0.5*base*height;
    }
}
