package org.example;

public abstract class Animal {
    static int animalCount = 0;
    String name;
    static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int lenght);

    public abstract void swim(int lenght);
}