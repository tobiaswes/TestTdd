package com.example.tdd;

import org.example.Calculator;
import org.example.SentimentCategory;
import org.example.SentimentResult;
import org.example.StringProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Complex TextAnalyzer TDD Demo")
public class TextAnalyzerTest {

    private Calculator calculator;
    private StringProcessor stringProcessor;
    private TextAnalyzer analyzer;

    @BeforeEach
    void setup() {

        calculator = new Calculator();
        stringProcessor = new StringProcessor();
        analyzer = new TextAnalyzer(calculator, stringProcessor);
    }


    @Nested
    @DisplayName("Sentiment Analysis Tests")
    class SentimentAnalysisTests {

        @Test
        @DisplayName("Should analyze positive sentiment correctly")
        void shouldAnalyzePositiveSentimentCorrectly() {

            String input = "what a wonderful day!";

            SentimentResult result = analyzer.analyzeSentiment(input);

            assertEquals(SentimentCategory.POSITIVE, result.getSentimentCategory(),
                    "Texten ska klassificeras som positiv.");


        }
    }
}
