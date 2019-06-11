package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.com.topic03_syntax.Task09SkippedAddendSum.*;

public class Task09SkippedAddendSumTest {
    @Test
    public void shouldCalculateSkippedAddendSum(){
        assertEquals(calculateSumVer1(3,5), 7);
        assertEquals(calculateSumVer2(3,5), 7);
        assertEquals(calculateSumVer1(0,0), 0);
        assertEquals(calculateSumVer2(3,-5), 0);
    }
}
