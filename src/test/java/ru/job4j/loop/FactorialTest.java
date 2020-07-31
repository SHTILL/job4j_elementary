package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int expected = 120;
        int rsl = Factorial.calc(5);
        assertThat(expected, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        int expected = 1;
        int rsl = Factorial.calc(0);
        assertThat(expected, is(1));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        int expected = 1;
        int rsl = Factorial.calc(1);
        assertThat(expected, is(1));
    }
}