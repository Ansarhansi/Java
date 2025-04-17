package internal;

public class Language {
    private String name;
    private String family;

    public void setName(String name) { this.name = name; }
    public void setFamily(String family) { this.family = family; }

    public void speak() {
        System.out.println("Speaking " + name + " from " + family + " family");
    }

    public String toString() {
        return "Language{name='" + name + "', family='" + family + "'}";
    }
}
