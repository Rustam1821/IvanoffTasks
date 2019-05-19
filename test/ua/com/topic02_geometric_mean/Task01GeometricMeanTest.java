package ua.com.topic02_geometric_mean;

import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class Task01GeometricMeanTest {
    @Test
    public void Should_Calculate_Geometric_Mean() {
        Assert.assertEquals(Task01GeometricMean.calculator(new int[]{2, 2}), 2.0);
        Assert.assertEquals(Task01GeometricMean.calculator(new int[]{2, 3}), 2.449489742783178);
        Assert.assertEquals(Task01GeometricMean.calculator(new int[]{0, 3}), 0.0);
    }

}
