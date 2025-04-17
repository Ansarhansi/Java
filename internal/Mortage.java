package internal;

class Mortgage extends FinancialProduct {
    @Override
    public void transact() {
        System.out.println("Mortgage is being processed for a home loan.");
    }
    public void calculateInterest() {
        System.out.println("Mortgage interest is being calculated.");
    }
}