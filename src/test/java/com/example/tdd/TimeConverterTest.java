package com.example.tdd;

import org.example.TimeConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TimeConverterTest {

    private TimeConverter timeConverter;

    @BeforeEach
    void setUp() {
        timeConverter = new TimeConverter();
    }

    @Test
    @DisplayName("Should convert 60 seconds to 1 minute")
    void shouldConvert60SecondsTo1Minute() {
        assertThat(timeConverter.secondsToMinutes(60))
                .isEqualTo(1.0);
    }

    @Test
    @DisplayName("Should throw exception for negative seconds")
    void shouldThrowExceptionForNegativeSeconds() {
        assertThatThrownBy(() -> timeConverter.secondsToMinutes(-10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("negative");
    }

    @Test
    @DisplayName("Should convert minutes to seconds")
    void shouldConvertMinutesToSeconds() {
        assertThat(timeConverter.minutesToSeconds(60))
                .isEqualTo(3600);
    }

    @Test
    @DisplayName("Should convert minutes to seconds")
    void shouldConvertMinutesToHours() {
        assertThat(timeConverter.minutesToHours(600))
                .isEqualTo(10);
    }

}

