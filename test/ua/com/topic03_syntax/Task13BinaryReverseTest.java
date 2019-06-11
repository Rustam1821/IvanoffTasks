package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.com.topic03_syntax.Task13BinaryReverse.reverse;

/**
 * Created by Rustam on 11.06.2019
 */
class Task13BinaryReverseTest {

    @Test
    public void shouldReverse() {
        assertEquals(reverse("1100010101"), "1010100011");
        assertEquals(reverse(Integer.toBinaryString(32)), "000001");
    }
}