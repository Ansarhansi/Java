package internal;

public class Material {
    private String name;
    private String use;

    public void setName(String name) { this.name = name; }
    public void setUse(String use) { this.use = use; }

    public void apply() {
        System.out.println(name + " is being used for " + use);
    }

    public String toString() {
        return "Material{name='" + name + "', use='" + use + "'}";
    }
}
