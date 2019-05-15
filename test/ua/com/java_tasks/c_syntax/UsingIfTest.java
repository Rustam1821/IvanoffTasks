package ua.com.java_tasks.c_syntax;

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import ua.com.java_tasks.c_syntax.UsingIf;

public class UsingIfTest {
    @Test
    public void compute_y_test() {
        Assert.assertEquals(UsingIf.computeY(32), 1);
        Assert.assertEquals(UsingIf.computeY(-15), -1);
        Assert.assertEquals(UsingIf.computeY(0), 0);
    }
}
