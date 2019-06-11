package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import static ua.com.topic03_syntax.Task14BitesInversion.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Rustam on 11.06.2019
 */
class Task14BitesInversionTest {

    @Test
    void shouldInvertBites() {
        assertEquals(invertBites(32), "000001");
        assertEquals(invertBites(789), "1010100011");
    }

    @Test
    void shouldConvertToDecimal() {
        assertEquals(convertToDecimal("000001"), 1);
        assertEquals(convertToDecimal("1010100011"), 675);
    }
}