package stringhelper;

import hw5.StringHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringHelperGetWordCountMethodTests extends BaseTest {

//- Сгруппировать тесты по фичам: проверка счетчика слов, проверка обрезания строки, поиск подстроки, поиск числа
//- Запустить из консоли только тесты для первых двух методов класса
//    Прислать на проверку код реализации класса, код тестов и скриншот запуска тестов из консоли
//    (последний пункт в задании про тесты)


    @Test
    public void validationDoesNotCountNumbersTest() {
        StringHelper text = new StringHelper("Checking that the method does not count numbers 1 2 15 101");

        assertEquals(8, text.getWordCount(), "Expected that the method does not count numbers");
    }

    @Test
    public void validationCountSpecialCharactersTest() {
        StringHelper text = new StringHelper("Checking that the method counts special characters @ # %");

        assertEquals(10, text.getWordCount(), "Expected that the method count special characters");
    }

    @Test
    public void validationDoesNotCountSpacesTest() {
        StringHelper text = new StringHelper("Checking that   the method  does not count spaces  ");

        assertEquals(8, text.getWordCount(), "Expected that the method does not count special spaces");
    }

    @Test
    public void validationDoesNotCountPunctuationMarksTest() {
        StringHelper text = new StringHelper("Checking, that. the; method; does not! count .? punctuation marks! !!");
        StringHelper text5 = new StringHelper("");

        assertTrue(text.getWordCount() == 9, "Expected that the method does not count punctuation marks");
        assertFalse(text5.getWordCount() > 0, "Expected that the method does not count empty string");
    }

    @Test
    public void validationDoesNotCountEmptyStringTest() {
        StringHelper text = new StringHelper("");

        assertFalse(text.getWordCount() > 0, "Expected that the method does not count empty string");
    }
}
