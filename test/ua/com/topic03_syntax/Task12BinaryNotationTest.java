package ua.com.topic03_syntax;

import org.junit.jupiter.api.Test;
import org.testng.Assert;


class Task12BinaryNotationTest {
    @Test
    void SHOULD_RETURN_BINARY_NUMBER_WITHOUT_ZEROS(){
        Assert.assertEquals(Task12BinaryNotation.convertToBinaryForm(789), Integer.toBinaryString(789));
        Assert.assertEquals(Task12BinaryNotation.convertToBinaryForm(-98), Integer.toBinaryString(-98));
    }


}