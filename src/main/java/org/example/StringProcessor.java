package org.example;

public class StringProcessor {

    public String reverse(String input) {

        if (input == null || input.isEmpty()) {
            return "";
        }

        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String text) {

        if (text == null || text.isEmpty()) {
            return true;
        }

        String cleanedText = text.toLowerCase().replaceAll("\\s+", "");

        String reversedText = new StringBuilder(cleanedText).reverse().toString();

        return cleanedText.equals(reversedText);
    }

}
