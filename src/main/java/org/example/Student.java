package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

import static java.util.Arrays.*;

public class Student {
    //String: name = имя, group = группа; Int: course = курс, grades = оценки по предметам;
    //average_mark - средняя оценка по всем предметам ученика
    // grades массив с оценками по каким-то предметам (1 предмет 1 оценка)

    private String name;
    private String group;
    private int course;
    private int[] grades;

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public static boolean CheckGrades(int[] grades) { // если функция возвращает true значит студент переходит на следующий курс
        float average_mark = ((Arrays.stream(grades).sum()) / (float) grades.length);
        return average_mark >= 3;
    }

    public static void deleteStudents(ArrayList<Student> students) {
        int lengthOfStudents = students.size() - 1;
        int i = 0;
        while (i < lengthOfStudents) {
            if (!Student.CheckGrades(students.get(i).grades)) {
                students.remove(i);
            } else {
                students.get(i).course++;
                i++;
            }
        }
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }

    public static void print(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.print(student.name + " " + student.course + " ");
        }
        System.out.println();
    }
}
