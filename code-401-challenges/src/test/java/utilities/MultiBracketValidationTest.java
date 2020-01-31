package utilities;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test public void testValidStrings() {
        String trueString1 = "[](){}";
        String trueString2 = "{}";
        String trueString3 = "()[[hello]]";
        String trueString4 = "{}{hello}[hi](())";
        assertTrue(MultiBracketValidation.checkValidBrackets(trueString1));
        assertTrue(MultiBracketValidation.checkValidBrackets(trueString2));
        assertTrue(MultiBracketValidation.checkValidBrackets(trueString3));
        assertTrue(MultiBracketValidation.checkValidBrackets(trueString4));
    }

    @Test public void testInvalidStrings() {
        String falseString1 = "[({}]";
        String falseString2 = "(](";
        String falseString3 = "{(})";
        assertFalse(MultiBracketValidation.checkValidBrackets(falseString1));
        assertFalse(MultiBracketValidation.checkValidBrackets(falseString2));
        assertFalse(MultiBracketValidation.checkValidBrackets(falseString3));
    }
}
