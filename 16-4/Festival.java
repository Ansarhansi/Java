package internal;

public class Festival {
    private String name;
    private String month;

    public void setName(String name) { this.name = name; }
    public void setMonth(String month) { this.month = month; }

    public void celebrate() {
        System.out.println("Celebrating " + name + " in " + month);
    }

    public String toString() {
        return "Festival{name='" + name + "', month='" + month + "'}";
    }
}
