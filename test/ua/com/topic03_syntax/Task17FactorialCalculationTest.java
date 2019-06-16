package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;

import static ua.com.topic03_syntax.Task17FactorialCalculation.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Rustam on 16.06.2019
 */
class Task17FactorialCalculationTest {

    @Test
    void calculateFactorialeTest() {
        assertEquals(calculateFactorial(5), 120L);
        assertEquals(calculateFactorial(15), 1307674368000L);
    }
}