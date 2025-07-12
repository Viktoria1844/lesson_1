package org.example;

import java.util.*;

import static org.example.Student.deleteStudents;
import static org.example.Student.printStudents;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Student Olya = new Student("Оля", "А-12", 1, new int[]{3, 3, 3, 2, 5});
        Student Sasha = new Student("Саша", "С-01", 3, new int[]{5, 5, 5, 4, 5});
        Student Pasha = new Student("Паша", "К-32", 4, new int[]{3, 4, 3, 4, 5});
        Student Kesha = new Student("Кеша", "Ф-325", 3, new int[]{3, 3, 3, 3, 2});
        Student Nikolay = new Student("Николай", "П-98", 3, new int[]{2, 5, 5, 2, 5});
        Student Petr = new Student("Пётр", "Р-25", 4, new int[]{4, 3, 3, 4, 5});
        ArrayList<Decanate> studentsList = new ArrayList<Decanate>(Arrays.asList(Olya, Sasha, Pasha, Kesha, Nikolay, Petr));

        Student.printStudents(studentsList, 3);

        System.out.println("-------------------------");

        Decanate.print(studentsList);
        Decanate.deleteStudents(studentsList);
        Decanate.translateToNextCourse(studentsList);

        Phonebook phoneBook = new Phonebook();

        phoneBook.add("Забияка", "+375291234568");
        phoneBook.add("Васечкин", "+375441887698");
        phoneBook.add("Певцов", "+375332589476");
        phoneBook.add("Иванов", "+3751118596");
        phoneBook.add("Иванов", "+375441356972");
        phoneBook.add("Савельев", "+375293479846");

        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Савельев: " + phoneBook.get("Савельев"));
        System.out.println("Телефоны Комарова: " + phoneBook.get("Комаров"));

        phoneBook.add("Шишкин", "+375441887698");
        System.out.println("Телефоны Шишкина: " + phoneBook.get("Шишкин"));
    }
}



