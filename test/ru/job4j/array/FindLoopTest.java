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
}