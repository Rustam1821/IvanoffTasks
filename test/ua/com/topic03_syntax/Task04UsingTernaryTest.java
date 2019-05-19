package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class Task04UsingTernaryTest {
    @Test
    public void compute_y_test() {
        Assert.assertEquals(Task04UsingTernary.computeY(62), 1);
        Assert.assertEquals(Task04UsingTernary.computeY(-8), -1);
        Assert.assertEquals(Task04UsingTernary.computeY(0), 0);
    }
}
