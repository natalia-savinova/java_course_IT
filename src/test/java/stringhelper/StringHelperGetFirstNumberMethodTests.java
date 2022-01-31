package stringhelper;

import hw5.StringHelper;
import org.junit.jupiter.api.Test;
import utils.BaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringHelperGetFirstNumberMethodTests extends BaseTest {
    @Test
    public void validationStringContainsMultipleNumbersAndWordsTest() {
        StringHelper text = new StringHelper("Checking that the method then string contains number 1, 2, 15, 101.");

        assertEquals("1", text.getFirstNumber(), "No number found in string with multiple numbers");
    }

    @Test
    public void validationStringWithoutNumberTest() {
        StringHelper text = new StringHelper("Checking that the method then string does not contains number @, #, %.");

        assertThrows(RuntimeException.class, text::getFirstNumber, "A String without numbers processed incorrectly");
    }

    @Test
    public void validationStringContainsMultipleNumbersTest() {
        StringHelper text = new StringHelper("0236, 2, 15, 101.");

        assertEquals("0236", text.getFirstNumber(), "A String with multiple numbers processed incorrectly");
    }

    @Test
    public void validationStringWithNumberBetweenCharactersTest() {
        StringHelper text = new StringHelper("Hello1!!");

        assertThrows(RuntimeException.class, text::getFirstNumber, "A String with number between characters processed incorrectly");
    }

    @Test
    public void validationStringWithNumberAtTheBeginningOfWordTest() {
        StringHelper text = new StringHelper("1Hello!!");

        assertThrows(RuntimeException.class, text::getFirstNumber, "A String with number at the beginning of the word processed incorrectly");
    }
}
