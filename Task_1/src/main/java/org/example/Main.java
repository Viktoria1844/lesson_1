package org.example;

import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dogKlepa = new Dog("Клёпа");
        Cat catLapochka = new Cat("Лапочка");
        Cat catVasilyi = new Cat("Василий");

        int minValue = 1;
        int maxValue = 500;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));

        dogKlepa.run(randomValue);
        dogKlepa.swim(5);

        catLapochka.run(randomValue);
        catLapochka.swim(randomValue);

        catVasilyi.run(randomValue);
        catVasilyi.swim(randomValue);

        System.out.println("Количество созданных животных: " + Animal.count);
        System.out.println("Количество созданных кошек: " + Cat.getCatCount());
        System.out.println("Количество созданных собак: " + Dog.getDogCount());
        System.out.println("--------------------------");

        Cat[] cats = new Cat[3];
        for (int i = 0; i < cats.length; i++) {
            cats[0] = new Cat("Кот Владик ");
            cats[1] = new Cat("Кот Семён ");
            cats[2] = new Cat("Кот Инокентий ");
        }

        Bowl_of_food bowl = new Bowl_of_food(45);
        for (int i = 0; i < cats.length; i++) {
            int foodTaken = bowl.getFood(10);
            cats[i].eat(foodTaken);
            if (i < cats.length - 1) {
                System.out.println("Осталось в миске " + bowl.FoodAmount() + " --> ");
            }
        }

        for (Cat cat : cats) {
            if (cat.fullness) {
                System.out.println(cat.name + "сыт. ");
            } else {
                System.out.println(cat.name + " голоден. ");
            }
        }

        catLapochka.eat(bowl.getFood(10));
        System.out.println("Осталось в миске " + bowl.FoodAmount());
        bowl.addFood(7);
        System.out.println("Осталось в миске " + bowl.FoodAmount());
        catVasilyi.eat(bowl.getFood(10));
        System.out.println("Осталось в миске " + bowl.FoodAmount() + ". Все коты сыты и довольны. ");
    }
}