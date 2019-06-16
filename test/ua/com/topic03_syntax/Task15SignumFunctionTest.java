package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;

import static ua.com.topic03_syntax.Task15SignumFunction.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Rustam on 13.06.2019
 */
class Task15SignumFunctionTest {

    @Test
    protected void calculateSignumTest() {
        assertEquals(calculateSignum(-153), -1);
        assertEquals(calculateSignum(12), 1);
        assertEquals(calculateSignum(0), 0);
    }
}