package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDivision(double third, double fourth) {
        return sub(third, fourth)
                + division(third, fourth);
    }

    public static double sumCalculation(double first, double second, double third, double fourth) {
        return sumAndMultiply(first, second)
                + subAndDivision(third, fourth);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumCalculation(10, 20, 10, 20));
    }
}
