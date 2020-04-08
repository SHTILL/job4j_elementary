package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenCoordinates_x2y2_and_x0y0_DistanceIsAround3() {
        int in_x1 = 2;
        int in_y1 = 2;
        int in_x2 = 0;
        int in_y2 = 0;
        double expected = 2.83;
        double rsl = Point.distance(in_x1, in_y1, in_x2, in_y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}