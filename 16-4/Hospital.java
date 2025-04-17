package internal;

public class Hospital {
    private String name;
    private int beds;

    public void setName(String name) { this.name = name; }
    public void setBeds(int beds) { this.beds = beds; }

    public void admitPatient() {
        System.out.println(name + " hospital has " + beds + " beds");
    }

    public String toString() {
        return "Hospital{name='" + name + "', beds=" + beds + "}";
    }
}
