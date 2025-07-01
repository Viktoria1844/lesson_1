package org.example;

public class Cat extends Animal {
    int MAX_RUN_DISTANCE = 200;
    boolean fullness;
    public int portionSize;
    private static int CatCount = 0;

    public Cat(String name) {
        super(name);
        CatCount++;
    }

    public Cat(String name, int portionSize) {
        super(name);
        this.portionSize = portionSize;
        fullness = false;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + (distance > MAX_RUN_DISTANCE ? MAX_RUN_DISTANCE : distance) + "м");
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public static int getCatCount() {
        return CatCount;
    }

    public void eat(BowlOfFood bowl) {
        if (!fullness && bowl.foodAmount>portionSize) {
            fullness = true;
            System.out.println(name + " съел(а) " + portionSize);
            bowl.decFood(portionSize);
        } else {
            System.out.println(name + " не поел. Ему нужно " + portionSize + ", а в миске " + bowl.foodAmount);
        }
    }

    public void printFullnes() {
        System.out.println(name + (fullness ? " сыт(а)" : " голоден"));;
    }
}
