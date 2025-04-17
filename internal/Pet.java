package internal;

public class Pet {
    private String type;
    private String name;

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void sound() {
        System.out.println(name + " makes a sound!");
    }

    public String toString() {
        return "Pet{type='" + type + "', name='" + name + "'}";
    }
}
