package org.example;

public class TimeConverter {

    private static final int SECONDS_PER_MINUTE = 60;

    public static double secondsToMinutes(double seconds) {
        return seconds / SECONDS_PER_MINUTE;
    }
}
