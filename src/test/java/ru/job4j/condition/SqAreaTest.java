package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP4andK1thenSquare1() {
        int inP = 4;
        int inK = 1;
        double expected = 1.0;
        double rsl = SqArea.square(inP, inK);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenP6andK2thenSquare2() {
        int inP = 6;
        int inK = 2;
        double expected = 2.0;
        double rsl = SqArea.square(inP, inK);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}