package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP4andK1thenSquare1() {
        int in_p = 4;
        int in_k = 1;
        double expected = 1.0;
        double rsl = SqArea.square(in_p, in_k);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenP6andK2thenSquare2() {
        int in_p = 6;
        int in_k = 2;
        double expected = 2.0;
        double rsl = SqArea.square(in_p, in_k);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}