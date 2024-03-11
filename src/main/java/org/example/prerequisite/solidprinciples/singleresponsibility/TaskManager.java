package org.example.prerequisite.solidprinciples.singleresponsibility;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class TaskManager {
    // Single Responsibility Principle states that a class should have only one reason to change,
    // meaning that it should have only one responsibility or concern.

    // Each method in TaskManager is related to managing tasks, and the class has only one responsibility:
    // managing tasks. It doesn't handle unrelated concerns such as input/output or data storage.

    private List<String> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Task removed: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    public void displayTasks() {
        System.out.println("Tasks: ");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}

class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Go to gym");
        taskManager.addTask("Go to office");
        taskManager.displayTasks();
        taskManager.removeTask("Go to gym");
        taskManager.addTask("Attend meeting");
        taskManager.displayTasks();
    }
}
