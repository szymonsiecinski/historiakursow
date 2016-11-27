/**
 * Created by uzytkownik on 19.10.16.
 */

import com.github.szymonsiecinski.historiakursow.domain.Conversion;
import com.github.szymonsiecinski.historiakursow.domain.Currency;
import com.github.szymonsiecinski.historiakursow.domain.TransactionRepository;
import org.junit.Before;
import org.junit.Test;

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
