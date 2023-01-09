package ru.job4j.checkstyle;

public class Broken {
    public static final String NEW_VALUE = "";

    public static final int SIZE_OF_EMPTY = 10;

    private String name;

    private String surname;

    public Broken(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d, int e, int f, int g) {

    }
}
