package com.example.tdd;

import org.example.TimeConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TimeConverterTest {

    @Test
    @DisplayName("Should convert 60 seconds to 1 minute")
    void shouldConvert60SecondsTo1Minute() {
        assertThat(TimeConverter.secondsToMinutes(60))
                .isEqualTo(1.0);
    }

    @Test
    void shouldThrowExceptionForNegativeSeconds(){
        assertThatThrowBy(()-> TimeConverter.secondsToMinutes(-10))
                .isInstaceOf(IllegalArgumentException.class)
                .hasMessageContaining("negative");
    }
}
