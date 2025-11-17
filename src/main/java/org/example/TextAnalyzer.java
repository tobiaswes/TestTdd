package org.example;

public class TextAnalyzer {

    private final Calculator calculator;
    private final StringProcessor stringProcessor;

    public TextAnalyzer(Calculator calculator, StringProcessor stringProcessor) {
        this.calculator = calculator;
        this.stringProcessor = stringProcessor;
    }

    public SentimentResult analyzeSentiment(String text) {
        //TODO: Implementera den riktiga logiken:
        // 1. Bearbeta strängen.
        // 2. Räkna positiva/negativa ord.
        // 3. Beräkna sentimentScore.
        // 4. Bestäm SentimentCategory baserat på poängen.

        return new SentimentResult(1.0, SentimentCategory.POSITIVE, 1, 0);
    }
}
