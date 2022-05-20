package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when003to023then2() {
        Point a = new Point(0, 0, 3);
        Point b = new Point(0, 2, 3);
        double dist = a.distance3d(b);
        double expected = 2.0;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when014to10minus1then5dot19() {
        Point a = new Point(0, 1, 4);
        Point b = new Point(1, 0, -1);
        double dist = a.distance3d(b);
        double expected = 5.19;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when09045to101956then129dot93() {
        Point a = new Point(0, 90, 45);
        Point b = new Point(101, 9, 56);
        double dist = a.distance3d(b);
        double expected = 129.93;
        Assert.assertEquals(expected, dist, 0.01);
    }
}