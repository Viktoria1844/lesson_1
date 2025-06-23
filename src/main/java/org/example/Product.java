package org.example;

public class Product {
    private String name;
    private String production_date;
    private String manufacturer;
    private String country_of_origin;
    private int price;
    private boolean booking_status;

    public Product(String name, String production_date, String manufacturer, String country_of_origin, int price, boolean booking_status) {
        this.name = name;
        this.production_date = production_date;
        this.manufacturer = manufacturer;
        this.country_of_origin = country_of_origin;
        this.price = price;
        this.booking_status = booking_status;
    }

    public String toString() {
        return "Название: " + name +
                ", Дата производства: " + production_date +
                ", Производитель: " + manufacturer +
                ", Страна происхождения: " + country_of_origin +
                ", Цена: " + price +
                ", Состояние бронирования покупателем: " + booking_status + ";";
    }

    public void info() {
        System.out.println("Название: " + name +
                ", Дата производства: " + production_date +
                ", Производитель: " + manufacturer +
                ", Страна происхождения: " + country_of_origin +
                ", Цена: " + price +
                ", Состояние бронирования покупателем: " + booking_status + ";");
    }
}
