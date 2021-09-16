package ru.job4j.profession;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String name, String surname, String education, String birthday, int level, String language) {
        super(name, surname, education, birthday, level);
        this.language = language;
    }
}
