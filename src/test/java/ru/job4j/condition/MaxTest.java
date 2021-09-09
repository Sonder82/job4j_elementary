package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax20To10Then20() {
        int left = 20;
        int right = 10;
        int expected = 20;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void whenMax10To20Then20() {
        int left = 10;
        int right = 20;
        int expected = 20;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax20To20Then20() {
        int left = 20;
        int right = 20;
        int expected = 20;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }
}
