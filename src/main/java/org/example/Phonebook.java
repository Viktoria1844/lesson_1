package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public static Map<String, ArrayList<String>> phonebook = new HashMap<>();

    public static void add(String name, String phone) {
        String nameKey = name.toLowerCase();
        if (phonebook.containsKey(nameKey)) {
            phonebook.get(nameKey).add(phone);
        } else {
            phonebook.put(nameKey, new ArrayList<String>(Arrays.asList(phone)));
        }
    }

    public static void get(String name) {
        ArrayList<String> entry = phonebook.get(name.toLowerCase());
        if (entry != null) {
            System.out.println("По фамилии " + name + " найден номер телефона: " + entry.toString());
        } else {
            System.out.println("По фамилии " + name + " номер телефона отсутствует");
        }
    }
}
