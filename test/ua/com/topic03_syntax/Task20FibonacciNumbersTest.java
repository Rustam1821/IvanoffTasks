package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import static ua.com.topic03_syntax.Task20FibonacciNumbers.buildFibonacciLoop;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Rustam on 16.06.2019
 */
class Task20FibonacciNumbersTest {

    @Test
    void buildFibonacciTest() {
        assertEquals(buildFibonacciLoop(89), "1 1 2 3 5 8 13 21 34 55 89");
    }
}