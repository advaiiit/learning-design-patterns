package org.example.prerequisite.oop.abstraction;

abstract class Vehicle {
    // Abstraction focuses on hiding the implementation details of a class and only exposing the essential features
    // to the outside world. Abstract classes cannot be instantiated.

    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Complete methods
    public void start() {
        System.out.println("Starting the vehicle");
    }

    public void stop() {
        System.out.println("Stopping the vehicle");
    }

    // Abstract method. Implementation is hidden
    public abstract void drive();
}

class Truck extends Vehicle {
    public Truck(String make, String model) {
        super(make, model);
    }

    @Override
    public void drive() {
        System.out.println("Driving the trunk");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model) {
        super(make, model);
    }

    @Override
    public void drive() {
        System.out.println("Riding the motorcycle");
    }
}


class Main {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Volvo", "Cargo");
        truck.drive();

        Vehicle motorcycle = new Motorcycle("Triumph", "Tiger");
        motorcycle.drive();
    }
}