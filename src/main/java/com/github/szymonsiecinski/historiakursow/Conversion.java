package com.github.szymonsiecinski.historiakursow;

/**
 * Created by uzytkownik on 09.10.16.
 */
public class Conversion {

    private Currency sourceCurrency;
    private Currency targetCurrency;
    private double amount;

    public void setSourceCurrency(Currency sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public void setTargetCurrency(Currency targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double perform() throws NonInitializedException {
        if(sourceCurrency == null || targetCurrency == null) {
            throw new NonInitializedException();
        }

        double conversionResult =
                sourceCurrency.getCurrencyToPlnRate() / targetCurrency.getCurrencyToPlnRate() * amount;
        return conversionResult;
    }
}
