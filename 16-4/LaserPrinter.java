package internal;

class LaserPrinter extends Printer {
    @Override
    public void print() {
        System.out.println("Printing with laser printer.");
    }

    public void refillToner() {
        System.out.println("Refilling toner.");
    }
}