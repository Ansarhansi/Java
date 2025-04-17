package internal;

public class InsurancePolicy {
    private String type;
    private double premium;

    public InsurancePolicy(String type, double premium) {
        this.type = type;
        this.premium = premium;
    }

    public void issuePolicy() {
        System.out.println("Issuing " + type + " insurance policy with a premium of " + premium);
    }

    public String toString() {
        return "InsurancePolicy{type='" + type + "', premium=" + premium + "}";
    }
}