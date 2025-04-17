package External;

import internal.Bitcoin;
import internal.Currency;

import java.lang.reflect.Method;

public class CurrencyTest {
    public static void main(String[] args) throws Exception {
        Currency currency = new Currency();
        Bitcoin bitcoin = new Bitcoin();

        // Null checks
        if (currency == null || bitcoin == null) {
            System.out.println("One of the objects is null.");
            return;
        }

        currency.describe();
        bitcoin.describe();

        for (int i = 1; i <= 100; i++) {
            String methodName = "method" + i;

            Method currencyMethod = Currency.class.getMethod(methodName, Currency.class);
            Method bitcoinMethod = Bitcoin.class.getMethod(methodName, Currency.class);

            if (bitcoin instanceof Currency) {
                currencyMethod.invoke(currency, bitcoin);
            }

            if (currency instanceof Currency) {
                bitcoinMethod.invoke(bitcoin, currency);
            }
        }
    }
}
