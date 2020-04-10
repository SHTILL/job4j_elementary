package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenLeftGreaterThenRight() {
        int inLeft = 10;
        int inRight = 5;
        int expected = inLeft;
        int rsl = Max.max(inLeft, inRight);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLeftLessThenRight() {
        int inLeft = 5;
        int inRight = 10;
        int expected = inRight;
        int rsl = Max.max(inLeft, inRight);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLeftEqualRight() {
        int inLeft = 10;
        int inRight = 10;
        int expected = inRight;
        int rsl = Max.max(inLeft, inRight);
        Assert.assertEquals(expected, rsl);
    }
}