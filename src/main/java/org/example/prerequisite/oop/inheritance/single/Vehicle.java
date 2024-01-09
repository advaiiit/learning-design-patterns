package org.example.prerequisite.oop.inheritance.single;

class Vehicle {

    public void start() {
        System.out.println(this.getClass().getSimpleName() + " is starting");
    }
}

class Car extends Vehicle {

    public void openTrunk() {
        System.out.println(this.getClass().getSimpleName() + "'s trunk is opening");
    }
}

class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Car car = new Car();
        car.start();
        car.openTrunk();
    }
}
