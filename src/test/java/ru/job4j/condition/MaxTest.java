package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax10To20Then20() {
        int first = 10;
        int second = 20;
        int expected = 20;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax20To10To30Then30() {
        int first = 20;
        int second = 10;
        int third = 30;
        int expected = 30;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void whenMax40To10To30T05Then30() {
        int first = 40;
        int second = 10;
        int third = 30;
        int fourth = 5;
        int expected = 40;
        int out = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, out);
    }
}
