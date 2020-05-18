package ru.job4j.stragery;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle t = new Triangle();
        assertThat(
                t.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("   +   ")
                                .add("  + +  ")
                                .add(" +   + ")
                                .add("+++++++")
                                .toString()
                )
        );
    }
}