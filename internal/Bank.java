package internal;

public class Bank {
    private String name;
    private int branches;

    public Bank(String name, int branches) {
        this.name = name;
        this.branches = branches;
    }

    public void openAccount() {
        System.out.println("Account opened in " + name);
    }

    public String toString() {
        return "Bank{name='" + name + "', branches=" + branches + "}";
    }
}
