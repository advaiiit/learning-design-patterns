package org.example.prerequisite.oop.classesandobjects;

public class Demo {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.id = 1;
        student1.name = "John Doe";
        student1.email = "johndoe@gmail.com";
        student1.study();

        Student student2 = new Student(2, "Jane Doe", "janedoe@gmail.com");
        student2.study();

        Student student3 = new Student(3, "James Doe");
        System.out.println(student3.id);

        // An instance isn't required to access the value of a static variable/method
        System.out.println(Student.university);
        Student.showUniversity();
    }
}
