package org.example;

public class Triangle extends Abstract {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double perimetr() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double s = 0.5 * (side1 + side2 + side3);
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String getShapeName() {
        return "Треугольник";
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
