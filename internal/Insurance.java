package internal;

public class Insurance {
    private String type;
    private double premium;

    public void setType(String type) { this.type = type; }
    public void setPremium(double premium) { this.premium = premium; }

    public void activate() {
        System.out.println(type + " insurance activated with ₹" + premium + " premium");
    }

    public String toString() {
        return "Insurance{type='" + type + "', premium=" + premium + "}";
    }
}
