package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDivision(double first, double second) {
        return sub(first, second)
                + division(first, second);
    }

    public static double sumCalculation(double a, double b) {
        return a + b;

    }

    public static void main(String[] args) {
        double a = MathCalculator.sumAndMultiply(10, 20);
        double b = MathCalculator.subAndDivision(10, 20);
        double result = MathCalculator.sumCalculation(a, b);
        System.out.println("Результат расчета равен: " + a);
        System.out.println("Результат расчета равен: " + b);
        System.out.println("Результат расчета равен: " + result);
    }
}