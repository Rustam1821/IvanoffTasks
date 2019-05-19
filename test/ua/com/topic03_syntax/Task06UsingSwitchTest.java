package ua.com.topic03_syntax;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Task06UsingSwitchTest {
    @Test
    public static void ShouldReturnY(){
        Assert.assertEquals(Task06UsingSwitch.switcher(2), 5);
        Assert.assertEquals(Task06UsingSwitch.switcher(0), 2);
        Assert.assertEquals(Task06UsingSwitch.switcher(4), 1);
        Assert.assertEquals(Task06UsingSwitch.switcher(99), 0);
    }
}
