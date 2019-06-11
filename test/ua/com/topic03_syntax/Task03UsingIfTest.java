package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class Task03UsingIfTest {
    @Test
    public void compute_Y_Test() {
        Assert.assertEquals(Task03UsingIf.computeY(32), 1);
        Assert.assertEquals(Task03UsingIf.computeY(-15), -1);
        Assert.assertEquals(Task03UsingIf.computeY(0), 0);
    }
}
