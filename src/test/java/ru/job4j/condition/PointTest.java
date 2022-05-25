package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to02then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when01to10then1dot41() {
        Point a = new Point(0, 1);
        Point b = new Point(1, 0);
        double dist = a.distance(b);
        double expected = 1.41;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when090to1010then135dot28() {
        Point a = new Point(0, 90);
        Point b = new Point(101, 0);
        double dist = a.distance(b);
        double expected = 135.28;
        Assert.assertEquals(expected, dist, 0.01);
    }
}