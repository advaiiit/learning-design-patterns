package org.example.prerequisite.solidprinciples.liskovsubstitution;

// Liskov Substitution states that objects of a superclass should be replaceable with object of its subclasses
// without affecting the correctness of the program. In other words, a subclass should behave in such a way that it
// does not break the expectations of clients using the superclass.

class FileHandler {
    public void open(String fileName) {
        System.out.println("Openning file: " + fileName);
    }

    public void close() {
        System.out.println("Closing file");
    }
}

class TextFileHandler extends FileHandler {
    @Override
    public void open(String fileName) {
        System.out.println("Opening text file: " + fileName);
    }

    @Override
    public void close() {
        System.out.println("Closing text file");
    }

    public String readText() {
        return "Text data from file";
    }

    public void writeText(String data) {
        System.out.println("Writing text to file: " + data);
    }
}

class BinaryFileHandler extends FileHandler {
    @Override
    public void open(String fileName) {
        System.out.println("Opening binary file: " + fileName);
    }

    @Override
    public void close() {
        System.out.println("Closing binary file");
    }

    public byte[] readBinaryData() {
        return new byte[]{0, 1, 2, 3};
    }

    public void writeBinaryData(byte[] data) {
        System.out.println("Writing binary data to file");
    }
}

class Main {
    public static void main(String[] args) {
        FileHandler textFileHandler = new TextFileHandler();
        textFileHandler.open("example.txt");
        ((TextFileHandler) textFileHandler).writeText("Hello World!");
        textFileHandler.close();

        FileHandler binaryFileHandler = new BinaryFileHandler();
        binaryFileHandler.open("example.bin");
        ((BinaryFileHandler) binaryFileHandler).writeBinaryData(new byte[]{0, 1, 2, 3});
        binaryFileHandler.close();
    }
}

// Both subclasses override the methods of the superclass and provide specialized behavior
// Each subclass also provides additional methods for performing file-specific operations.
// In client code, despite being subclasses, they can be substituted for 'FileHandler' without affecting the
// correctness of the program, demonstrating the Liskov Substitution Principle

