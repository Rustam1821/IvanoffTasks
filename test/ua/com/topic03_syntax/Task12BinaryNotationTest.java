package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.assertEquals;
import static ua.com.topic03_syntax.Task12BinaryNotation.convertToBinaryForm;


class Task12BinaryNotationTest {
    protected @Test
    void SHOULD_RETURN_BINARY_NUMBER_WITHOUT_ZEROS(){
        assertEquals(convertToBinaryForm(789), Integer.toBinaryString(789));
        assertEquals(convertToBinaryForm(-98), Integer.toBinaryString(-98));
    }


}