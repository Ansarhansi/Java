package internal;

class Forex extends CurrencyExchange {
    @Override
    public void convert() {
        System.out.println("Forex converting to multiple currencies.");
    }

    public void analyzeRates() {
        System.out.println("Analyzing exchange rates.");
    }
}