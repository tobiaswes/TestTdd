package org.example;

public class StringProcessor {

    public String reverse(String input) {

        return new StringBuilder(input).reverse().toString();
    }
}
