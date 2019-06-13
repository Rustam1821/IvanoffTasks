package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ua.com.topic03_syntax.Task16LeastCommonMultiple.findLeastCommonMultiple;

/**
 * Created by Rustam on 13.06.2019
 */
class Task16LeastCommonMultipleTest {

    @Test
    public void findLeastCommonMultipleTest() {
        assertEquals(findLeastCommonMultiple(999, 15), 4995);
    }
}