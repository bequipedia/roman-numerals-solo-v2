import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "5, V",
            "6, VI",
            "7, VII",
            "8, VIII",
            "10, X"
    })
    void should_return_III_when_3_given(int inputNumber, String expectedOutput) {
        RomanNumerals romanNumerals = new RomanNumerals();

        String actualOutput = romanNumerals.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }

}
