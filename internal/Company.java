package internal;

public class Company {
    private String name;
    private int employees;

    public Company(String name, int employees) {
        this.name = name;
        this.employees = employees;
    }

    public void operate() {
        System.out.println(name + " company is operating with " + employees + " employees.");
    }

    public String toString() {
        return "Company{name='" + name + "', employees=" + employees + "}";
    }
}