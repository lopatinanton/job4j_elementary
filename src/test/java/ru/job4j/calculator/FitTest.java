package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
        public void whenMan177Then88dot55() {
        short in = 177;
        double expected = 88.55;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test

        public void whenWoman168Then66dot7() {
        short in = 168;
        double expected = 66.7;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}