package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void whenNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        Point c = new Point(0, 2);
        Triangle t = new Triangle(a, b, c);
        double result = t.area();
        Assert.assertEquals(result, -1, 0.01);
    }

    @Test
    public void whenExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 2);
        Triangle t = new Triangle(a, b, c);
        double result = t.area();
        Assert.assertEquals(result, 2, 0.01);
    }
}