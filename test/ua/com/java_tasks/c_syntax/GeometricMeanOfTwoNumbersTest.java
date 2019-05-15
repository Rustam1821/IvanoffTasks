package ua.com.java_tasks.c_syntax;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static ua.com.java_tasks.c_syntax.GeometricMeanOfTwoNumbers.calculateGeometricMean;

public class GeometricMeanOfTwoNumbersTest {
    @Test
    public void Should_Calculate_Two_Numbers_Geometric() {
        Assert.assertEquals(calculateGeometricMean(new int[]{2, 2}), 2.0);
        Assert.assertEquals(calculateGeometricMean(new int[]{3, 5}), 3.872983346207417);
    }
}
