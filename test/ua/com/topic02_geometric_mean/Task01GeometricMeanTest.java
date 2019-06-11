package ua.com.topic02_geometric_mean;

import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.assertEquals;
import static ua.com.topic02_geometric_mean.Task01GeometricMean.calculator;


public class Task01GeometricMeanTest {
    @Test
    public void shouldCalculateGeometricMean() {
        assertEquals(calculator(new int[]{2, 2}), 2.0);
        assertEquals(calculator(new int[]{2, 3}), 2.449489742783178);
        assertEquals(calculator(new int[]{0, 3}), 0.0);
    }

}
