package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.com.topic03_syntax.Task11PowersOfEight.exponentiationUsingArithmetic;
import static ua.com.topic03_syntax.Task11PowersOfEight.exponentiationUsingBitwise;

/**
 * Created by Rustam on 05.06.2019
 */
class Task11PowersOfEightTest {

    @Test
    public void bitwiseShouldRaiseEightToThePower() {
        assertEquals(exponentiationUsingBitwise(4), 4096);
        assertEquals(exponentiationUsingBitwise(10), 1073741824);
        assertEquals(exponentiationUsingBitwise(0), 1);
        assertEquals(exponentiationUsingBitwise(1), 8);
    }

    @Test
    void arithmeticShouldRaiseEightToThePower() {
        assertEquals(exponentiationUsingArithmetic(4), 4096);
        assertEquals(exponentiationUsingArithmetic(10), 1073741824);
        assertEquals(exponentiationUsingArithmetic(0), 1);
        assertEquals(exponentiationUsingArithmetic(1), 8);
    }
}