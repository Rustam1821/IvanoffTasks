package ua.com.topic03_syntax;

import org.testng.annotations.Test;
import org.testng.Assert;

import static ua.com.topic03_syntax.Task06UsingSwitch.switcher;

public class Task06UsingSwitchTest {
    @Test
    public static void ShouldReturnY(){
        Assert.assertEquals(switcher(2), 5);
        Assert.assertEquals(switcher(0), 2);
        Assert.assertEquals(switcher(4), 1);
        Assert.assertEquals(switcher(99), 0);
    }
}
