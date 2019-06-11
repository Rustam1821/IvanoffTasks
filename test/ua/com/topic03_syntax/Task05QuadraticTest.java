package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.com.topic03_syntax.Task05Quadratic.*;

public class Task05QuadraticTest {
    @Test
    public void shouldFindRoots() {
        assertEquals(printResult(solution(5, 0, 0)), "-0.0");
        assertEquals(printResult(solution(4, 0, -3)), "0.8660254037844386 -0.8660254037844386");
        assertEquals(printResult(solution(4, 0, 36)), "No solution");
        assertEquals(printResult(solution(4, -7, 0)), "1.75 0.0");
        assertEquals(printResult(solution(3, -14, -5)),"5.0 -0.3333333333333333");
        assertEquals(printResult(solution(1, -10, 21)), "7.0 3.0");
    }
}
