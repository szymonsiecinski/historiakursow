/**
 * Created by uzytkownik on 27.09.16.
 */
public class Rate {
    private String currencyCode;
    private String currencyName;
    private double currencyToPlnRate;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getCurrencyToPlnRate() {
        return currencyToPlnRate;
    }

    public void setCurrencyToPlnRate(double currencyToPlnRate) {
        this.currencyToPlnRate = currencyToPlnRate;
    }
}
