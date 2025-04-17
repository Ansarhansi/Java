package internal;

public class CurrencyExchange {
    private String fromCurrency;
    private String toCurrency;

    public void setFromCurrency(String fromCurrency) { this.fromCurrency = fromCurrency; }
    public void setToCurrency(String toCurrency) { this.toCurrency = toCurrency; }

    public void exchange() {
        System.out.println("Exchanging " + fromCurrency + " to " + toCurrency);
    }

    public String toString() {
        return "CurrencyExchange{from='" + fromCurrency + "', to='" + toCurrency + "'}";
    }
}
