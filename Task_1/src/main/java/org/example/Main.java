package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dogKlepa = new Dog("Клёпа");
        dogKlepa.run(150);
        dogKlepa.swim(9);

        Cat catLapochka = new Cat("Лапочка");
        catLapochka.run(350);
        catLapochka.swim(20);

        Cat catVasilyi = new Cat("Василий");
        catVasilyi.run(50);
        catVasilyi.swim(0);

        System.out.println("Количество созданных животных: " + Animal.count);
        System.out.println("Количество созданных собак: " + Dog.getDogCount());
        System.out.println("Количество созданных кошек: " + Cat.getCatCount());

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Пушистик", 0);
        cats[1] = new Cat("Кнопа", 18);
        cats[2] = new Cat("Беляш", 31);
        cats[3] = new Cat("Жорик", 24);

        BowlOfFood catsBowl = new BowlOfFood(78);
        for (Cat cat : cats) {
            cat.eat(catsBowl);
            cat.printFullnes();
        }
    }
}