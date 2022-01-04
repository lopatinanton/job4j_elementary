package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to30then3() {
        double expected = 3;
        int x3 = 0;
        int y3 = 0;
        int x4 = 3;
        int y4 = 0;
        double out = Point.distance1(x3, y3, x4, y4);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to05then4() {
        double expected = 4;
        int x5 = 4;
        int y5 = 0;
        int x6 = 0;
        int y6 = 0;
        double out = Point.distance2(x5, y5, x6, y6);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to05then5() {
        double expected = 5;
        int x7 = 0;
        int y7 = 0;
        int x8 = 0;
        int y8 = 5;
        double out = Point.distance3(x7, y7, x8, y8);
        Assert.assertEquals(expected, out, 0.01);
    }
}