package internal;

public class Delivery {
    private String service;
    private boolean isFast;

    public void setService(String service) { this.service = service; }
    public void setFast(boolean fast) { isFast = fast; }

    public void deliver() {
        System.out.println(service + " delivery is " + (isFast ? "fast" : "standard"));
    }

    public String toString() {
        return "Delivery{service='" + service + "', isFast=" + isFast + "}";
    }
}
