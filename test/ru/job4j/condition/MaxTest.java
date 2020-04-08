package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenLeftGreaterThenRight() {
        int in_left = 10;
        int in_right = 5;
        int expected = in_left;
        int rsl = Max.max(in_left, in_right);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLeftLessThenRight() {
        int in_left = 5;
        int in_right = 10;
        int expected = in_right;
        int rsl = Max.max(in_left, in_right);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLeftEqualRight() {
        int in_left = 10;
        int in_right = 10;
        int expected = in_right;
        int rsl = Max.max(in_left, in_right);
        Assert.assertEquals(expected, rsl);
    }
}