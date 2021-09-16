package ru.job4j.profession;

public class Builder extends Engineer {
    private String house;

    public Builder(String name, String surname, String education, String birthday, String level, String house) {
        super(name, surname, education, birthday, level);
        this.house = house;
    }
}