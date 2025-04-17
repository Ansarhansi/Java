package internal;

public class Account {
    private String holder;
    private double balance;

    public void setHolder(String holder) { this.holder = holder; }
    public void setBalance(double balance) { this.balance = balance; }

    public void showBalance() {
        System.out.println("Showing account balance");
    }

    public String toString() {
        return "Account{holder='" + holder + "', balance=" + balance + "}";
    }
}
