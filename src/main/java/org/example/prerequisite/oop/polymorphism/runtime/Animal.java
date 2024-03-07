package org.example.prerequisite.oop.polymorphism.runtime;

class Animal {

    // Run-time polymorphism, also known as dynamic polymorphism, occurs when the method overriding is resolved at
    // runtime. The decision on which method to call is made by the JVM based on object's type during runtime.
    // In method overriding, a subclass provides specific implementation of a method that is already defined in its
    // superclass.

    void makeSound() {
        System.out.println("Animal makes a generic sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}