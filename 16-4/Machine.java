package internal;

public class Machine {
    private String name;
    private String purpose;

    public Machine(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }

    public void operate() {
        System.out.println(name + " is operating.");
    }

    public String toString() {
        return "Machine{name='" + name + "', purpose='" + purpose + "'}";
    }
}
