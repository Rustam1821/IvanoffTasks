package ua.com.java_tasks.c_syntax.rounding;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class RoundingTest {
    public void Should_Round_Real_Number(){
        Assert.assertEquals(Rounding.roundIt(5.9), 6.0);
        Assert.assertEquals(Rounding.roundIt(162.15), 162.0);
    }
}
