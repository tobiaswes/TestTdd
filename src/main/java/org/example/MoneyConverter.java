package org.example;

import java.math.BigDecimal;

public class MoneyConverter {

    public static int usdToEuro(BigDecimal usd) {

        BigDecimal exchangeRate = new BigDecimal("0.92");
        return usd.multiply(exchangeRate).intValue();

    }
}
