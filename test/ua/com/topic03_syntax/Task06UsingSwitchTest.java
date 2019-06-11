package ua.com.topic03_syntax;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.com.topic03_syntax.Task06UsingSwitch.switcher;

public class Task06UsingSwitchTest {
    @Test
    public static void shouldReturnY(){
        assertEquals(switcher(2), 5);
        assertEquals(switcher(0), 2);
        assertEquals(switcher(4), 1);
        assertEquals(switcher(99), 0);
    }
}
