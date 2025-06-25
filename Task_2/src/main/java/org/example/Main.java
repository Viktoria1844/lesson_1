package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(2,"Красный", "Зелёный");
        circle.showInfo();

        Rectangle rectangle = new Rectangle(2, 4, "Фиолетовый","Жёлтый");
        rectangle.showInfo();

        Triangle triangle = new Triangle(0.5, 1.2, 1.1, "Серый", "Голубой");
        triangle.showInfo();

    }
}