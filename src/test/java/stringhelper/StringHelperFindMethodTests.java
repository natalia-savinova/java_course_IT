package stringhelper;

import hw5.StringHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utils.BaseTest;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringHelperFindMethodTests extends BaseTest {
    @ParameterizedTest
    @MethodSource("methodIMatchingCase")
    void searchForSubstringIfCaseMatchesParametrizedTest(int index, String expected) {
        StringHelper text1 = new StringHelper("test this class please");

        assertEquals(expected, text1.find(index, "is"), "Substring with matched case not found");
    }

    @ParameterizedTest
    @MethodSource("methodIMismatchingCase")
    void searchForSubstringIfCaseDoesNotMatchParametrizedTest(int index, String expected) {
        StringHelper text2 = new StringHelper("test thIs class please");

        assertEquals(expected, text2.find(index, "is"), "Substring with mismatched case not found");
    }

    static Stream<Arguments> methodIMatchingCase() {
        return Stream.of(
                Arguments.arguments(5,"is class please"),
                Arguments.arguments(10,"test this class please")
        );
    }

    static Stream<Arguments> methodIMismatchingCase() {
        return Stream.of(
                Arguments.arguments(5,"Is class please"),
                Arguments.arguments(10,"test thIs class please")
        );
    }
}
