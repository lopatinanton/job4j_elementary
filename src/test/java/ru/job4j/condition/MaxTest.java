package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenSum1To2Then3() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSum10r3f5Then18() {
        int left = 10;
        int right = 3;
        int first = 5;
        int result = Max.max(left, right, first);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSum6r7f6s4Then23() {
        int left = 6;
        int right = 7;
        int first = 6;
        int second = 4;
        int result = Max.max(left, right, first, second);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}