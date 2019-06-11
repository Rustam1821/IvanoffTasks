package ua.com.topic03_syntax;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task07SymbolsByCodeTest {
    @Test
    public static void shouldPrintChars() {
        assertEquals(Task07SymbolsByCode.printRow(),"абвгдежзийклмнопрстуфхцчшщъыьэюяѐёђѓєѕіїјљњћќѝўџѠ");
    }
}
