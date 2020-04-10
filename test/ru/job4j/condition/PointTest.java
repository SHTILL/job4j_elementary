package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenCoordinatesX2Y2andX0Y0ThenDistanceIsAround3() {
        int inX1 = 2;
        int inY1 = 2;
        int inX2 = 0;
        int inY2 = 0;
        double expected = 2.83;
        double rsl = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}