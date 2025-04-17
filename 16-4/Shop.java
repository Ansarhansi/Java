package internal;

public class Shop {
    private String name;
    private String type;

    public Shop(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void openShop() {
        System.out.println(name + " shop is open and selling " + type + " items.");
    }

    public String toString() {
        return "Shop{name='" + name + "', type='" + type + "'}";
    }
}