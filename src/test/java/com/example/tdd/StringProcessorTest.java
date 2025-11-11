package com.example.tdd;
import org.example.StringProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

@DisplayName("StringProcessor Demo")
public class StringProcessorTest {

    private StringProcessor processor;

    @BeforeEach
    void setup() {

        processor = new StringProcessor();

    }

    @Nested
    @DisplayName("String Reversal Tests")
    class StringReversalTests {

        @Test
        @DisplayName("should reverse a string")
        void shouldReverseSimpleString() {

            String input = "abc";
            String expected = "cba";

            String actual = processor.reverse(input);

            assertEquals(expected, actual, "Texten skulle vändas");

        }

        @Test
        @DisplayName("Should handle single character")
        void shouldHandleSingleCharacter() {
            String input = "A";
            String expected = "A";

            assertEquals(expected, processor.reverse(input), "En enskild bokstav skall inte ändra.");
        }

        @Test
        @DisplayName("Should handle null and empty string")
        void shouldHandleNullAndEmptyStrings() {
            String inputNull = null;
            String expected = "";

            assertEquals(expected, processor.reverse(inputNull), "Ska returnera en tom sträng");

            String inputEmptyString = "";

            assertEquals(expected, processor.reverse(inputEmptyString), "Ska returnera en tom sträng");
        }


    }
}
