package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenIsMonoHorizontalX() {
        char[][] input = {
                {' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X'},
                {' ', ' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenIsNotMonoHorizontalX() {
        char[][] input = {
                {' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'Z'},
                {' ', ' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(false));
    }

    @Test
    public void whenIsMonoVerticalX() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenIsNotMonoVerticalX() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'Z'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(false));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'Y', 'Z'};
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'T', ' '},
                {' ', ' ', 'Z'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'Y', 'Z'};
        assertThat(result, is(not(expect)));
    }
}