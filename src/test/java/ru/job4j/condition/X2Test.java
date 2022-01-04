package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA1B1C1X1Then3() {
            int a = 1;
            int b = 1;
            int c = 1;
            int x = 1;
            int expected = 3;
            int rsl = X2.calc(a, b, c, x);
            Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA10B11C11X11Then2() {
        int a1 = 0;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int expected = 2;
        int rsl1 = X2.calc1(a1, b1, c1, x1);
        Assert.assertEquals(expected, rsl1);
    }

    @Test
    public void whenA21B21C21X21Then2() {
        int a2 = 1;
        int b2 = 1;
        int c2 = 0;
        int x2 = 1;
        int expected = 2;
        int rsl2 = X2.calc1(a2, b2, c2, x2);
        Assert.assertEquals(expected, rsl2);
    }

    @Test
    public void whenA31B31C31X30Then1() {
        int a3 = 1;
        int b3 = 1;
        int c3 = 1;
        int x3 = 0;
        int expected = 1;
        int rsl3 = X2.calc1(a3, b3, c3, x3);
        Assert.assertEquals(expected, rsl3);
    }
}