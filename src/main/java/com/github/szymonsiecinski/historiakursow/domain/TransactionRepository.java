package com.github.szymonsiecinski.historiakursow.domain;

/**
 * Created by uzytkownik on 19.10.16.
 */
public class TransactionRepository implements Repository<Conversion> {

    private Currency sourceCurrency;
    private Currency targetCurrency;

    public Currency getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(Currency sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public Currency getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(Currency targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public TransactionRepository() {
        this(null, null);
    }

    public TransactionRepository(Currency sourceCurrency, Currency targetCurrency) {
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
    }

    public void add(Conversion object) {

    }

    public Conversion get(int id) {
        return null;
    }

    public Conversion search(Criteria criteria) {
        return null;
    }

    public void modify(Conversion object) {

    }

    public void delete(Conversion object) {

    }
}
