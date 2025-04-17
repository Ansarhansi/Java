package internal;

public class Trade {
    private String goods;
    private double value;

    public Trade(String goods, double value) {
        this.goods = goods;
        this.value = value;
    }

    public void conductTrade() {
        System.out.println("Conducting trade of " + goods + " worth " + value + " USD.");
    }

    public String toString() {
        return "Trade{goods='" + goods + "', value=" + value + "}";
    }
}