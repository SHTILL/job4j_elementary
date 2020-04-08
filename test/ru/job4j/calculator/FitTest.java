package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight180Weight92() {
        double in = 180.0;
        double expected = 92;
        double rsl = Fit.manWeight(in);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenWomanHeight180Weigh80() {
        double in = 180.0;
        double expected = 80.5;
        double rsl = Fit.womanWeight(in);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}