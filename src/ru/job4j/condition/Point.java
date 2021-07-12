package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double first  = Math.pow(a, 2);
        double b = y2 - y1;
        double second  = Math.pow(b, 2);
        double c = first + second;
        double result = Math.sqrt(c);
        return result;

    }

    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 6;
        int x2 = 2;
        int y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result(" + x1 + ',' + y1 + ") to (" + x2 + ',' +  y2 + ") is " + result);
    }
}
