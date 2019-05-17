package ua.com.java_tasks.c_syntax;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ua.com.java_tasks.c_syntax.Quadratic.printResult;
import static ua.com.java_tasks.c_syntax.Quadratic.solution;

@Test
public class QuadraticTest {
    public void Should_Find_Roots() {
        Assert.assertEquals(printResult(solution(5, 0, 0))
                , "-0.0");
        Assert.assertEquals(printResult(solution(4, 0, -3))
                , "0.8660254037844386 -0.8660254037844386");
        Assert.assertEquals(printResult(solution(4, 0, 36))
                , "No solution");
        Assert.assertEquals(printResult(solution(4, -7, 0))
                , "1.75 0.0");
        Assert.assertEquals(printResult(solution(3, -14, -5))
                , "5.0 -0.3333333333333333");
        Assert.assertEquals(printResult(solution(1, -10, 21))
                , "7.0 3.0");

    }
}
