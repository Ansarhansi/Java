package internal;

public class Drink {
    private String name;
    private boolean isCold;

    public Drink(String name, boolean isCold) {
        this.name = name;
        this.isCold = isCold;
    }

    public void consume() {
        System.out.println("Drinking " + name);
    }

    public String toString() {
        return "Drink{name='" + name + "', isCold=" + isCold + "}";
    }
}