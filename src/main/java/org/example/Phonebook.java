package org.example;

import com.sun.jdi.request.DuplicateRequestException;

import java.util.*;

public class Phonebook {
    private static final Set<String> globalPhoneNumbers = new HashSet<>();
    private Map<String, Set<String>> phoneBook;

    public Phonebook() {
        phoneBook = new HashMap<>();
    }

    public boolean add(String surname, String phone) {
        // Проверяем глобальное хранилище на наличие номера
        if (globalPhoneNumbers.contains(phone)) {
            System.out.println("Номер телефона существует у другого пользователя");
            return false;
        }

        // Проверяем уникальность номера для конкретной фамилии
        if (phoneBook.containsKey(surname)) {
            Set<String> phones = phoneBook.get(surname);
            if (phones.contains(phone)) {
                System.out.println("Номер уже существует у данного пользователя");
                return false;
            }
        }

        globalPhoneNumbers.add(phone);

        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new HashSet<>());
        }
        phoneBook.get(surname).add(phone);
        return true;
    }

    public Set<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new HashSet<>());
    }
}

