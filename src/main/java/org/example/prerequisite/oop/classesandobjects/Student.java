package org.example.prerequisite.oop.classesandobjects;

public class Student {

    // Instance variables
    int id;
    String name;
    String email;

    // Every instance of the class shares the same static variable
    // If changes are made to that variable, all other instances will see the effect of that change
    static String university = "Stanford";

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

    // Instance method
    public void study() {
        System.out.println(name + " is studying");
    }

    // Static methods can't access instance variable/methods directly
    // We can't use this method inside static method
    // A method which does not use any instance variables should probably be declared a static method
    static void showUniversity() {
        // Best Practice: Use Class name and not reference variable to access a static variable
        System.out.println("Student studies in " + Student.university + " university");
    }


}
