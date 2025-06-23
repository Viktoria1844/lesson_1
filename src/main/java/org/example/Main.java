package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. Создать класс "Товар" с полями: название, дата производства, производитель, страна происхождения,
        // цена, состояние бронирования покупателем.
        //Конструктор класса должен заполнять эти поля при создании объекта.
        //Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.
        //Создать массив из 5 товаров.

        Product[] prodArray = new Product[5];
        prodArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        prodArray[1] = new Product("Xiaomi Mi TV A Pro 43", "12.04.2025", "Xiaomi Corp.", "China", 936, true);
        prodArray[2] = new Product("Philips 50PUS8139", "25.11.2024", "Philips Corp.", "Russia", 2205, false);
        prodArray[3] = new Product("Haier 50 Smart TV S2", "11.09.2024", "Haier Corp.", "Russia", 1275, true);
        prodArray[4] = new Product("TCL QD-Mini LED", "29.06.2023", "TCL Corp.", "Russia", 1973, false);

        for (Product prod : prodArray) {
            prod.info();
        }


        //3. Создать класс Park с внутренним классом,
        // с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.

        Park Gomel = new Park("Гомель");
        Park.Attraction[] GomelAttractions = new Park.Attraction[4];
        GomelAttractions[0] = Gomel.new Attraction("Микс", "10:00-20:00", 6);
        GomelAttractions[1] = Gomel.new Attraction("Летающая тарелка", "09:00-20:00", 5);
        GomelAttractions[2] = Gomel.new Attraction("Колесо обозрения", "10:00-22:00", 7);
        GomelAttractions[3] = Gomel.new Attraction("Воздушные гонки", "10:00-19:00", 4);
        for (Park.Attraction attraction : GomelAttractions) {
            System.out.println(attraction);
        }
    }
}

