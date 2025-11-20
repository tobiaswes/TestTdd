package com.example.tdd;
import org.example.StringProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.junit.jupiter.api.Assertions.*;

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

        @ParameterizedTest
        @NullAndEmptySource
        @DisplayName("Should handle null and empty strings")
        void shouldHandleNullAndEmptyStrings(String input) {

            String expected = "";
            assertEquals(expected, processor.reverse(input),
                    "Ska returnera en tom sträng för både null och tom input.");
        }

        @Test
        @DisplayName("Should preserve space in reversal")
        void shouldPreserveSpaceInReversal() {
            String input = "123 abcd";
            String expected = "dcba 321";
            assertEquals(expected, processor.reverse(input), "Vänder på strängen och behåller mellanslaget");
        }

    }

    @Nested
    @DisplayName("Palindrome Detection Tests")
    class PalindromeDetectionTests {

        @Test
        @DisplayName("Should detect simple palindrome")
        void shouldDetectSimplePalindrome() {
            String input = "madam";
            assertTrue(processor.isPalindrome(input), "Madam ska vara ett palindrom.");
        }

        @Test
        @DisplayName("Should detect non-palindrome")
        void shouldDetectNonPalindrome() {
            String input = "random";
            assertFalse(processor.isPalindrome(input), "Random ska inte vara ett palindrom.");
        }

        @Test
        @DisplayName("Should handle case-insensitive palindromes")
        void shouldHandleCaseInsensitivePalindromes() {
            String input = "Racecar";
            assertTrue(processor.isPalindrome(input), "Racecar (med stor bokstav) ska vara ett palindrom.");
        }

        @Test
        @DisplayName("Should handle palindromes with spaces")
        void shouldHandlePalindromesWithSpaces() {
            String input = "never odd or even";
            assertTrue(processor.isPalindrome(input), "Frasen ska vara ett palindrom trots mellanslag.");
        }

        @Test
        @DisplayName("Should handle single character as palindrome")
        void shouldHandleSingleCharacterAsPalindrome() {
            String input = "X";
            assertTrue(processor.isPalindrome(input), "En enskild bokstav ska alltid vara ett palindrom.");
        }

        @ParameterizedTest
        @NullAndEmptySource
        @DisplayName("Should handle null and empty as palindromes")
        void shouldHandleNullAndEmptyAsPalindromes(String input) {
            assertTrue(processor.isPalindrome(input), "Null och tom sträng ska betraktas som palindrom.");
        }
    }
}
