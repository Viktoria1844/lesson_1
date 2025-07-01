package org.example;

import java.util.*;

import static org.example.Student.printStudents;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student Olya = new Student("Оля", "Б-125", 1, new int[]{3, 5, 4, 3, 2});
        Student Petia = new Student("Пётр", "А-02", 3, new int[]{5, 4, 5, 2, 4});
        Student Sasha = new Student("Саша", "А-03", 2, new int[]{5, 5, 4, 5, 5});
        Student Kesha = new Student("Кеша", "Ф-544", 5, new int[]{2, 4, 4, 2, 2});
        Student Pasha = new Student("Паша", "С-12", 2, new int[]{4, 4, 5, 3, 5});
        LinkedList<Student> students = new LinkedList<>();

        students.add(Olya);
        students.add(Petia);
        students.add(Sasha);
        students.add(Kesha);
        students.add(Pasha);

        printStudents(students, 2);

        System.out.println("---------------------------------");

        Student.print(students);
        Student.deleteStudent(students);
        Student.print(students);

    }
}