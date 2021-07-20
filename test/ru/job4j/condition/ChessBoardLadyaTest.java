package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class ChessBoardLadyaTest {

    @Test
    public void wayIs6() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 6;
        int result = ChessBoardLadya.way(x1, y1, x2, y2);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }
}