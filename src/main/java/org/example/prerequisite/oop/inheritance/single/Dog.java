package org.example.prerequisite.oop.inheritance.single;

public class Dog extends Animal {

    // super() is used to call the constructor of the immediate parent class from the child class
    // It has to be the first statement of the constructor

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }
}
