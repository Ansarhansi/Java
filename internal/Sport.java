package internal;

public class Sport {
    private String name;
    private int players;

    public void setName(String name) { this.name = name; }
    public void setPlayers(int players) { this.players = players; }

    public void play() {
        System.out.println("Playing " + name);
    }

    public String toString() {
        return "Sports{name='" + name + "', players=" + players + "}";
    }
}
