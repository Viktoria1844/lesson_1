package org.example;

public class Dog extends Animal {
    int MAX_RUN_DISTANCE = 500;
    int MAX_SWIM_DISTANCE = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int lenght) {
        if (lenght >= MAX_RUN_DISTANCE) {
            System.out.println(name + " не может пробежать " + lenght + " м. ");
        } else {
            System.out.println(name + " пробежал(а) " + lenght + " м. ");
        }
    }

    @Override
    public void swim(int lenght) {
        if (lenght >= MAX_SWIM_DISTANCE) {
            System.out.println(name + " не может проплыть " + lenght + " м. ");
        } else {
            System.out.println(name + " проплыл(а) " + lenght + " м. ");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
