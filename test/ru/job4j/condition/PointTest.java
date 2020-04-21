package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenCoordinatesX2Y2andX0Y0ThenDistanceIsAround3() {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(0, 0);
        double expected = 2.83;
        double rsl = p1.distance(p2);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}