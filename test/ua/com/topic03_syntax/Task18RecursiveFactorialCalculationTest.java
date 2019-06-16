package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.com.topic03_syntax.Task18RecursiveFactorialCalculation.*;

/**
 * Created by Rustam on 16.06.2019
 */
class Task18RecursiveFactorialCalculationTest {

    @Test
    public void calculateFactorialTest() {
        assertEquals(recursiveFact(5), 120L);
        assertEquals(recursiveFact(15), 1307674368000L);
    }
}