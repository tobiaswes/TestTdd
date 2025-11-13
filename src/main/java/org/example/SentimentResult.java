package org.example;

public class SentimentResult {

    private final double sentimentScore;
    private final SentimentCategory sentimentCategory;
    private final int positveWordCount;
    private final int negativeWordCount;

    public SentimentResult(
            double sentimentScore,
            SentimentCategory sentimentCategory,
            int positveWordCount,
            int negativeWordCount) {

        this.sentimentScore = sentimentScore;
        this.sentimentCategory = sentimentCategory;
        this.positveWordCount = positveWordCount;
        this.negativeWordCount = negativeWordCount;
    }

    public double getSentimentScore() {
        return sentimentScore;
    }

    public SentimentCategory getSentimentCategory() {
        return sentimentCategory;
    }

    public int getPositveWordCount() {
        return positveWordCount;
    }

    public int getNegativeWordCount() {
        return negativeWordCount;
    }
}
