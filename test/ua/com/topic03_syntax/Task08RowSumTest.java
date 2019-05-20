package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class Task08RowSumTest {
    @Test
    static void SHOULD_CALCULATE_ROW_SUM() {
        Assert.assertEquals(Task08RowSum.sumRowCalculation1Variant(5), 2.283333333333333);
        Assert.assertEquals(Task08RowSum.sumRowCalculation2Variant(8), 2.7178571428571425);
        Assert.assertEquals(Task08RowSum.sumRowCalculation3Variant(2), 1.5);
    }
}
