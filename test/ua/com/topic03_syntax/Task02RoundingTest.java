package ua.com.topic03_syntax;

import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class Task02RoundingTest {
    public void Should_Round_Real_Number() {
        Assert.assertEquals(Task02Rounding.roundIt(5.9), 6.0);
        Assert.assertEquals(Task02Rounding.roundIt(162.15), 162.0);
        Assert.assertEquals(Task02Rounding.roundIt(2.499), 2.0);
    }
}
