/**
 * Created by uzytkownik on 09.10.16.
 */

import com.github.szymonsiecinski.historiakursow.Conversion;
import com.github.szymonsiecinski.historiakursow.Currency;
import com.github.szymonsiecinski.historiakursow.NonInitializedException;
import static org.junit.Assert.*;
import org.junit.Test;

public class ConversionTest {

    @Test(expected = NonInitializedException.class)
    public void shouldThrowNotInitializedExceptionWhenClassIsNonInitialized() throws NonInitializedException {
        Conversion conversion = new Conversion();
        conversion.perform();
    }

    @Test
    public void shouldReturnTheSameAmountWhenSourceAndTargetCurrencyAreTheSameOne() {
        Conversion conversion = new Conversion();
        Currency pln = new Currency("PLN", "złoty polski", 1);
        double amount = 100;
        conversion.setSourceCurrency(pln);
        conversion.setTargetCurrency(pln);
        conversion.setAmount(amount);

        try {
            double newAmount = conversion.perform();

            assertEquals(amount, newAmount, 0);
        }
        catch(NonInitializedException e) {}
    }

    @Test
    public void shouldReturnNewAmountWhenSourceAndTargetCurrencyAreDifferent() {
        Conversion conversion = new Conversion();
        Currency usd = new Currency("USD", "dolar amerykański", 3.8505);
        Currency czk = new Currency("CZK", "korona czeska", 0.1586);
        double expected = 2427.80;
        conversion.setSourceCurrency(usd);
        conversion.setTargetCurrency(czk);
        conversion.setAmount(expected);

        try {
            double calculated = conversion.perform();

            assertEquals(expected, calculated, 0.01);
        }
        catch(NonInitializedException e) {}
    }
}
