package org.example.prerequisite.oop.classesandobjects;

public class Student {

    int id;
    String name;
    String email;

    // Non-parameterized constructor
    public Student() {}

    // Parameterized constructor
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // this refers current object
    // this() is used for calling class constructor from different
    // constructor of the same class
    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this(id);
        this.name = name;
    }

    public void study() {
        System.out.println(name + " is studying");
    }
}
