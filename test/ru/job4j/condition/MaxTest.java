package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenLeftGreaterThenRight() {
        int inLeft = 10;
        int inRight = 5;
        int rsl = Max.max(inLeft, inRight);
        Assert.assertEquals(inLeft, rsl);
    }

    @Test
    public void whenLeftLessThenRight() {
        int inLeft = 5;
        int inRight = 10;
        int rsl = Max.max(inLeft, inRight);
        Assert.assertEquals(inRight, rsl);
    }

    @Test
    public void whenLeftEqualRight() {
        int inLeft = 10;
        int inRight = 10;
        int rsl = Max.max(inLeft, inRight);
        Assert.assertEquals(inRight, rsl);
    }

    @Test
    public void whenFirstMax() {
        int result = Max.max(4, 1, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax() {
        int result = Max.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = Max.max(2, 1, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenEqual() {
        int result = Max.max(4, 4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenFourArgsFirstMax() {
        int result = Max.max(4, 1, 2, -7);
        assertThat(result, is(4));
    }

    @Test
    public void whenFourArgsSecondMax() {
        int result = Max.max(1, 4, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenFourArgsThirdMax() {
        int result = Max.max(2, 1, 4, 0);
        assertThat(result, is(4));
    }

    @Test
    public void whenFourArgsFourthMax() {
        int result = Max.max(2, 1, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenFourArgsEqual() {
        int result = Max.max(7, 7, 7, 7);
        assertThat(result, is(7));
    }
}