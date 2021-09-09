package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortTwo() {
        int[] data = new int[] {5, 1, 4, 2, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortThree() {
        int[] data = new int[] {9, 4, 7, 2, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 4, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }
}