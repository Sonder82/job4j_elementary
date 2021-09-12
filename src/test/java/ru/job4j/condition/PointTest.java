package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to10then2() {
        double expected = 1;
        Point a = new Point(2, 0);
        Point b = new Point(1, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when53to28then2() {
        double expected = 5.83;
        Point a = new Point(5, 3);
        Point b = new Point(2, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when001to002then3() {
        double expected = 2.23;
        Point a = new Point(0, 0, 1);
        Point b = new Point(0, 2, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when081to042then3() {
        double expected = 4.12;
        Point a = new Point(0, 8, 1);
        Point b = new Point(0, 4, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
