package com.example.tdd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
    }
}
