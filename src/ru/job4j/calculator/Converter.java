package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(150);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("150 rubles are " + dollar + " dollar.");
    }
}
