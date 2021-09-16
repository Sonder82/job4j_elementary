package ru.job4j.profession;

public class Doctor extends Profession {
    private int doctorCount;

    public Doctor(String name, String surname, String education, String birthday, int doctorCount) {
        super();
        this.doctorCount = doctorCount;

    }

}
