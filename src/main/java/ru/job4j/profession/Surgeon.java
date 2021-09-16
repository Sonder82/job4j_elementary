package ru.job4j.profession;

public class Surgeon extends Doctor {
    private String specialist;

    public Surgeon(String name, String surname, String education, String birthday, int doctorCount, String specialist) {
        super(name, surname, education, birthday, doctorCount);
        this.specialist = specialist;
    }

}
