package ua.com.java_learning_tasks.c_syntactic_constructions;

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import static ua.com.java_learning_tasks.c_syntactic_constructions.two_numbers_geometric_mean
        .GeometricMeanOfTwoNumbers.calculateGeometricMean;

public class GeometricMeanOfTwoNumbersTest {
    @Test
    public void Should_Calculate_Two_Numbers_Geometric (){
        Assert.assertEquals(calculateGeometricMean(new int[]{2, 2}), 2.0);
        Assert.assertEquals(calculateGeometricMean(new int[]{3, 5}), 3.872983346207417);
    }
}
