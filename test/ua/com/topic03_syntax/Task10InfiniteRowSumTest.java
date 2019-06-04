package ua.com.topic03_syntax;


import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.assertEquals;

import static ua.com.topic03_syntax.Task10InfiniteRowSum.calculateInfiniteRowSum;

public class Task10InfiniteRowSumTest {
    @Test
    public void SHOULD_RETURN_1_75(){
        assertEquals(calculateInfiniteRowSum(0.2), 1.75);
    }
}