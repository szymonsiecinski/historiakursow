/**
 * Created by uzytkownik on 19.10.16.
 */

import com.github.szymonsiecinski.historiakursow.Conversion;
import com.github.szymonsiecinski.historiakursow.Currency;
import com.github.szymonsiecinski.historiakursow.TransactionRepository;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

public class TransactionRepositoryTest {

    private Currency pln;
    private Currency eur;
    private TransactionRepository repository;

    @Before
    public void init() {
        pln = new Currency("PLN", "Złoty polski", 1);
        eur = new Currency("EUR", "Euro", 4.3135874);
        repository = new TransactionRepository();
    }

    @Test
    public void shouldReadTransactionFromDataStoreAfterAddition() {
        Conversion conversion = new Conversion(pln, eur, 100);
        repository.add(conversion);
    }
}
