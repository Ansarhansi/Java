package internal;

class Antivirus extends Software {
    @Override
    public void describe() {
        System.out.println("This is Antivirus software.");
    }
    public void scan() {
        System.out.println("Scanning for threats.");
    }
}