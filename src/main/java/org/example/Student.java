package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

import static java.util.Arrays.*;

public class Student extends Decanate {
    protected String name;
    protected String group;
    protected int course;
    protected int[] grades;
    //String: name = имя, group = группа; Int: course = курс, grades = оценки по предметам;
    //average_mark - средняя оценка по всем предметам ученика
    // grades массив с оценками по каким-то предметам (1 предмет 1 оценка)


    public Student(String name, String group, int course, int[] grades) {
        super(name, group, course, grades);
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public static void printStudents(ArrayList<Decanate> students, int course) {
        for (Decanate student : students) {
            if (student.course == course) {
                System.out.println(student.getName());
            }
        }
    }

}
