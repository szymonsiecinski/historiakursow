package com.github.szymonsiecinski.historiakursow.domain;

/**
 * Created by uzytkownik on 27.09.16.
 */
public class Currency {
    private String code;
    private String name;
    private double currencyToPlnRate;

    public String getCode() {
        return code;
    }

    public void setCode(String currencyCode) {
        this.code = currencyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String currencyName) {
        this.name = currencyName;
    }

    public double getCurrencyToPlnRate() {
        return currencyToPlnRate;
    }

    public void setCurrencyToPlnRate(double currencyToPlnRate) {
        this.currencyToPlnRate = currencyToPlnRate;
    }

    public Currency() {
        this(null, null, 1);
    }

    public Currency (String code, String name) {
        this(code, name, 1);
    }

    public Currency(String code, String name, double currencyToPlnRate) {
        this.code = code;
        this.name = name;
        this.currencyToPlnRate = currencyToPlnRate;
    }
}
