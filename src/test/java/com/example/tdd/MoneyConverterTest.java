package com.example.tdd;

import org.example.MoneyConverter;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.assertj.core.api.Assertions.assertThat;

public class MoneyConverterTest {

    @Test
    void shouldConvertUsdToEuro() {
        BigDecimal usd = new BigDecimal("100.00");

        BigDecimal result = BigDecimal.valueOf(MoneyConverter.usdToEuro(usd));

        assertThat(result).isEqualByComparingTo("92.00");
    }

    @Test
    void shouldConvertZeroUsdToEuro() {
        BigDecimal usd = new BigDecimal("0");

        BigDecimal result = BigDecimal.valueOf(MoneyConverter.usdToEuro(usd));

        assertThat(result).isEqualByComparingTo("0");
    }


}
