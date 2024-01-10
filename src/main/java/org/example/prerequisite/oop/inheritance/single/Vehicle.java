package org.example.prerequisite.oop.inheritance.single;

class Vehicle {

    public void start() {
        System.out.println(this.getClass().getSimpleName() + " is starting");
    }
}

class Car extends Vehicle {

    public void openTrunk() {
        System.out.println("Car's trunk is opening");
    }

    // Overriding a method is when you create a method on a subclass,
    // which has the same signature as a method on a super class.

    // Override a parent class method when you want the child class
    // to show different behavior for that method.

    @Override
    public void start() {
        super.start();
        System.out.println("Car will stop once it reaches it's destination.");
    }
}

class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Car car = new Car();
        car.openTrunk();
        car.start();
    }
}
