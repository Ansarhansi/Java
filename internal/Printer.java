package internal;

class Printer extends Machine {
    @Override
    public void describe() {
        System.out.println("This is a Printer for printing documents.");
    }
    public void printDocument() {
        System.out.println("Printer is printing a document.");
    }
    public void print() {
        System.out.println("Printing document.");
    }
}
