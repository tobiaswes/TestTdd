package org.example;

public class TimeConverter {

    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MINUTES_PER_HOUR = 60;

    public double secondsToMinutes(double value) {

        validateNonNegative(value, "seconds");
        return value / SECONDS_PER_MINUTE;
    }

    public static void validateNonNegative(double value, String name) {
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
    }

    public double minutesToSeconds(double seconds) {
        validateNonNegative(seconds, "seconds");
        return Math.round(seconds * SECONDS_PER_MINUTE);
    }

    public double minutesToHours(double minutes) {
        validateNonNegative(minutes, "hours");
        return Math.round(minutes * MINUTES_PER_HOUR);
    }

}
