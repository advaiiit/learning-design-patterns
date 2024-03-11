package org.example.prerequisite.oop.abstraction;

import java.math.BigDecimal;

interface Shape {
    // Interfaces are used to achieve 100% abstraction.

    // Variables are by default public static final
    double pi = 3.14;

    // Methods are by default public abstract
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }
}

class Rectangle implements Shape {
    double length;
    double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Perimeter of circle: " + circle.perimeter());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
    }
}
