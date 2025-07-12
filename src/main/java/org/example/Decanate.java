package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Decanate {
    private String name;
    private String group;
    protected int course;
    protected int[] grades;

    public Decanate(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static boolean checkGrades(int[] grades) { // если функция возвращает true значит студент переходит на следующий курс
        float average_mark = ((Arrays.stream(grades).sum()) / (float) grades.length);
        return average_mark >= 3;
    }

    public static void deleteStudents(ArrayList<Decanate> students) {
        int lengthOfStudents = students.size() - 1;
        for (int i = 0; i < lengthOfStudents; i++) {
            if (!Decanate.checkGrades(students.get(i).grades)) {
                students.remove(i);
            }
        }
    }

    public static void translateToNextCourse(ArrayList<Decanate> students) {
        for (Decanate student : students) {
            student.setCourse(student.getCourse() + 1);
            System.out.println("Студент " + student.name + " переведен на " + student.course + " курс.");
        }
    }

    public static void print(ArrayList<Decanate> students) {
        for (Decanate student : students) {
            System.out.println("Студент " + student.name + " учится " + student.course + " курсе. ");
        }

        System.out.println();
    }
}

