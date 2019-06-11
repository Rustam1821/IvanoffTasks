package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static ua.com.topic03_syntax.Task01GeometricMeanOfTwoNumbers.calculateGeometricMean;

public class Task01GeometricMeanOfTwoNumbersTest {
    @Test
    public void shouldCalculateTwoNumbersGeometric() {
        Assert.assertEquals(calculateGeometricMean(new int[]{2, 2}), 2.0);
        Assert.assertEquals(calculateGeometricMean(new int[]{3, 5}), 3.872983346207417);
    }
}
