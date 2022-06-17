package com.syntax.class18;

public class Laptop {
    String name;
    String model;
    String storage;
    String memory;
    double screenSize;
    public Laptop() {

        System.out.println("Basic construction is happening...");
    }
    public Laptop(String name) {
        this.name = name;
    }
    public Laptop(String name, String model) {
        this.name = name;
        this.model = model;
    }
    public Laptop(String name, String model, String storage) {
        /*this.name = name;
        this.model = model;*/
        this(name, model);
        this.storage = storage;

    }
    public Laptop(String name, String model, String storage, String memory) {
        /*this.name = name;
        this.model = model;
        this.storage = storage;*/
        this(name, model, storage);
        this.memory = memory;
    }

    public Laptop(String name, String model, String storage, String memory, double screenSize) {
        /*this.name = name;
        this.model = model;
        this.storage = storage;
        this.memory = memory;*/
        this(name, model, storage, memory);
        this.screenSize = screenSize;
    }

    public static void main(String[] args) {
        Laptop apple=new Laptop("Apple","M1Pro 140","512","16",14.2);
    }
}
