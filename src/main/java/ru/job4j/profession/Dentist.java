package ru.job4j.profession;

public class Dentist extends Doctor {
    private String child;

    public Dentist(String name, String surname, String education, String birthday, int doctorCount, String child) {
        super(name, surname, education, birthday, doctorCount);
        this.child = child;

    }
}