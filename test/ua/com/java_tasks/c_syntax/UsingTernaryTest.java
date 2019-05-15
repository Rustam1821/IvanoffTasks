package ua.com.java_tasks.c_syntax;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class UsingTernaryTest {
    @Test
    public void compute_y_test() {
        Assert.assertEquals(UsingTernary.computeY(62), 1);
        Assert.assertEquals(UsingTernary.computeY(-8), -1);
        Assert.assertEquals(UsingTernary.computeY(0), 0);
    }
}
