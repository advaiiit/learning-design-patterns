package org.example.prerequisite.oop.polymorphism.compiletime;

class Calculator {

    // Compile-time polymorphism, also known as static polymorphism, occurs when the method overloading is resolved
    // at compile time. The decision on which method to call is made by the compiler. In method overloading, multiple
    // methods with the same name but different parameters are defined within the same class. Appropriate method to be
    // called is determined by the compiler based on the number and type of arguments passed during invocation.

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String concat(String str1, String str2) {
        return str1 + str2;
    }

    String concat(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 3);
        double sum2 = calculator.add(2.5, 6.5);
        String result1 = calculator.concat("Hello ", "World");
        String result2 = calculator.concat("Java ", "is ", "fun!");

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(result1);
        System.out.println(result2);
    }
}