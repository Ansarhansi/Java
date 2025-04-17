package internal;

public class Element {
    private String symbol;
    private int atomicNumber;

    public void setSymbol(String symbol) { this.symbol = symbol; }
    public void setAtomicNumber(int atomicNumber) { this.atomicNumber = atomicNumber; }

    public void react() {
        System.out.println("Element " + symbol + " is reacting.");
    }

    public String toString() {
        return "Element{symbol='" + symbol + "', atomicNumber=" + atomicNumber + "}";
    }
}
