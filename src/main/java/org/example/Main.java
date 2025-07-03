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
        Student Petr = new Student("Пётр", "Р-25", 1, new int[]{4, 3, 3, 4, 5});
        ArrayList<Student> studentsList = new ArrayList<Student>(Arrays.asList(Olya, Sasha, Pasha, Kesha, Nikolay, Petr));

        Student.printStudents(studentsList, 1);

        System.out.println("-------------------------");

        Student.print(studentsList);
        Student.deleteStudents(studentsList);
        Student.print(studentsList);


        Phonebook.add("Забияка", "+375291234568");
        Phonebook.add("Васечкин", "+375441887698");
        Phonebook.add("Певцов", "+375332589476");
        Phonebook.add("Иванов", "+3751118596");
        Phonebook.add("Иванов", "+375441356972");
        Phonebook.add("Савельев", "+375293479846");


        Phonebook.get("Забияка");
        Phonebook.get("Певцов");
        Phonebook.get("Иванов");
        Phonebook.get("Иванченко");
    }


}



