package org.example;

public class Rectangle extends Abstract {
    private double width;
    private double height;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimetr() {
        return 2 * (width * height);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String getShapeName() {
        return "Прямоугольник";
    }

    @Override
    public void showInfo() {
        System.out.println("-----------------------------\nХарактеристики фигуры:");
        System.out.println(getShapeName());
        System.out.println("Периметр: " + perimetr());
        System.out.println("Площадь: " + area());
        System.out.println("Цвет фона: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
    }
}
