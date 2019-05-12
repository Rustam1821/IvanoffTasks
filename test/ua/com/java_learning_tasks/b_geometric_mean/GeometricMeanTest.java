package ua.com.java_learning_tasks.b_geometric_mean;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static ua.com.java_learning_tasks.b_geometric_mean.GeometricMean.calculator;

public class GeometricMeanTest {
    @Test
    public void Should_Calculate_Geometric_Mean() {
        Assert.assertEquals(calculator(new int[]{2, 2}), 2.0);
        Assert.assertEquals(calculator(new int[]{2, 3}), 2.449489742783178);
        Assert.assertEquals(calculator(new int[]{0, 3}), 0.0);
    }

}
