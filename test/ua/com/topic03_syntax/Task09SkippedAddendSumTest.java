package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static ua.com.topic03_syntax.Task09SkippedAddendSum.*;

public class Task09SkippedAddendSumTest {
    @Test
    public void SHOULD_CALCULATE_SKIPPED_ADDEND_SUM(){
        Assert.assertEquals(calculateSumVer1(3,5), 7);
        Assert.assertEquals(calculateSumVer2(3,5), 7);
        Assert.assertEquals(calculateSumVer1(0,0), 0);
        Assert.assertEquals(calculateSumVer2(3,-5), 0);
    }
}
