package ua.com.topic03_syntax;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Task07SymbolsByCodeTest {
    @Test
    public static void should_Print_Chars() {
        Assert.assertEquals(Task07SymbolsByCode.printRow(),
                "абвгдежзийклмнопрстуфхцчшщъыьэюяѐёђѓєѕіїјљњћќѝўџѠ");

    }
}
