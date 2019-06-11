package ua.com.topic03_syntax;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task08RowSumTest {
    @Test
    public static void shouldCalculateRowSum() {
        assertEquals(Task08RowSum.sumRowCalculation1Variant(5), 2.283333333333333);
        assertEquals(Task08RowSum.sumRowCalculation2Variant(8), 2.7178571428571425);
        assertEquals(Task08RowSum.sumRowCalculation3Variant(2), 1.5);
    }
}
