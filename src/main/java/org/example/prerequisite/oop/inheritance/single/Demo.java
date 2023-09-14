package org.example.prerequisite.oop.inheritance.single;

public class Demo {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        animal.move("slow");
        animal.makeNoise("some");

        System.out.println();

        Dog dog = new Dog("Husky", "Medium", 25);
        dog.move("fast");
        dog.makeNoise("howling");
    }
}
