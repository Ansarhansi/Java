package internal;

public class Network {
    private String name;
    private int users;

    public Network(String name, int users) {
        this.name = name;
        this.users = users;
    }

    public void connect() {
        System.out.println(name + " network is connecting " + users + " users.");
    }

    public String toString() {
        return "Network{name='" + name + "', users=" + users + "}";
    }
}