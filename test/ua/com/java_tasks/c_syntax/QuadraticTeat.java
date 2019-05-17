package ua.com.java_tasks.c_syntax;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class QuadraticTeat {
    public void Should_Find_Roots() {
        Assert.assertEquals(Quadratic.solution(5, 0, 0), 0.0);
    }
}
