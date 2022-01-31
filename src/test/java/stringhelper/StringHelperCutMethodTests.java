package stringhelper;

import hw5.StringHelper;
import org.junit.jupiter.api.Test;
import utils.BaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringHelperCutMethodTests extends BaseTest {
    @Test
    public void removingIncompleteWord() {
        StringHelper text = new StringHelper(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore e"); //101

        assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut...",
                text.cut(), "Expected that the method discards incomplete word");
    }

    @Test
    public void cutToTheEndOfTheWord() {
        StringHelper text = new StringHelper(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut etta dolore"); //104

        assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut etta...",
                text.cut(), "Expected that the method processing a single-letter word at the end correctly");
    }

    @Test
    public void cutStringLessHundredSymbols() {
        StringHelper text = new StringHelper("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt out labor"); // 99

        assertThrows(RuntimeException.class, text::cut, "Expected that the method throws exception");
    }
}
