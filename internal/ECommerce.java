package internal;

public class ECommerce {
    private String platform;
    private int users;

    public ECommerce(String platform, int users) {
        this.platform = platform;
        this.users = users;
    }

    public void sell() {
        System.out.println("Selling products on " + platform + " to " + users + " users.");
    }

    public String toString() {
        return "ECommerce{platform='" + platform + "', users=" + users + "}";
    }
}