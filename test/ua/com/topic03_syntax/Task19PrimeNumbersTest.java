package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import static ua.com.topic03_syntax.Task19PrimeNumbers.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Rustam on 16.06.2019
 */
class Task19PrimeNumbersTest {

    @Test
    protected void isPrimeTest() {
        assertEquals(isPrime(499), true);
        assertEquals(isPrime(2), true);
        assertEquals(isPrime(25), false);

    }
}