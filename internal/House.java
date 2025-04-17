package internal;

public class House {
    private String address;
    private int rooms;

    public House(String address, int rooms) {
        this.address = address;
        this.rooms = rooms;
    }

    public void showHouse() {
        System.out.println("The house at " + address + " has " + rooms + " rooms.");
    }

    public String toString() {
        return "House{address='" + address + "', rooms=" + rooms + "}";
    }
}