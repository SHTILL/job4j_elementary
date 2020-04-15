package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenElementFound() {
        int[] dataIn = new int[] {1, 3, 5, 7, 9};
        int rsl = FindLoop.indexOf(dataIn, 5);
        assertThat(rsl, is(2));
    }
    @Test
    public void whenElementNotFound() {
        int[] dataIn = new int[] {1, 3, 5, 7, 9};
        int rsl = FindLoop.indexOf(dataIn, 2);
        assertThat(rsl, is(-1));
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
}