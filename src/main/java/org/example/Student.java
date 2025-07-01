package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

public class Student {
    private String name;
    private String group;
    private int course;
    private int[] mark;

    public Student(String name, String group, int course, int[] mark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mark = mark;
    }

    public int[] getMark() {
        return mark;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }


    public static boolean checkMark(int[] mark) {
        float average_mark = ((Arrays.stream(mark).sum()) / (float) mark.length);
        return average_mark >= 3;
    }

    public static void deleteStudent(LinkedList<Student> students) {
        int lengthOfStudents = students.size();
        int i = 0;
        while (i < lengthOfStudents) {
            if (!Student.checkMark(students.get(i).mark)) {
                students.remove(i);
                lengthOfStudents--;
                students.get(i).course++;
            } else i++;
        }
    }

    public static void printStudents(LinkedList<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName() + " учится на " + course + " курсе.");
            }
        }
    }

    public static void print(LinkedList<Student> students) {
        for (Student student : students) {
            System.out.print(student.name + " учится на " + student.course + " курсе. ");
        }
        System.out.println();
    }
}