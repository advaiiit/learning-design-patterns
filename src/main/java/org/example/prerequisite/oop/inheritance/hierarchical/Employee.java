package org.example.prerequisite.oop.inheritance.hierarchical;

class Employee {

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    public void assignTasks() {
        System.out.println(name + " is assigning tasks");
    }
}

class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    public void code() {
        System.out.println(name + " is writing code");
    }
}

class Demo {

    public static void main(String[] args) {
        Employee employee = new Employee("John");
        System.out.println(employee.getName());

        Manager manager = new Manager("Tom");
        manager.assignTasks();

        Developer developer = new Developer("Jane");
        developer.code();
    }
}
