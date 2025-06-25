package org.example;

public abstract class Abstract implements Area, Perimetr {
    public String fillColor;
    public String borderColor;

    public Abstract(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public abstract double area();

    @Override
    public abstract double perimetr();

    public abstract String getShapeName();

    public abstract void showInfo();
}
