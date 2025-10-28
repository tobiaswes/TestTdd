package org.example;

public class TimeConverter {

    private static final int SECONDS_PER_MINUTE = 60;

    public double secondsToMinutes(double value) {

        validateNonNegative(value, "seconds");
        return value / SECONDS_PER_MINUTE;
    }

    public static void validateNonNegative(double value, String name) {
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
    }

}
