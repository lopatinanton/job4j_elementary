package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
        public void whenMan177Then89() {
        short in = 177;
        double expected = 88.55;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test

        public void whenWoman168Then67() {
        short in1 = 168;
        double expected1 = 66.69;
        double out1 = Fit.womanWeight(in1);
        Assert.assertEquals(expected1, out1, 0.01);
    }
}