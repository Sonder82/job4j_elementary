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

    public static double sumCalculation(double a, double b) {
        return a + b;

    }

    public static void main(String[] args) {
        double a = MathCalculator.sumAndMultiply(10, 20);
        double b = MathCalculator.subAndDivision(10, 20);
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumCalculation(a, b));
    }
}
