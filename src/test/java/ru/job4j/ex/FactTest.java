package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNegative() {
        new Fact().calc(-1);
    }

    @Test
    public void whenPositive() {
        Fact f = new Fact();
        assertThat(f.calc(3), is(6));

    }

    @Test
    public void whenZero() {
        Fact f = new Fact();
        assertThat(f.calc(0), is(1));

    }
}