package internal;

public class Subject {
    private String name;
    private int credits;

    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public void study() {
        System.out.println("Studying " + name);
    }

    public String toString() {
        return "Subject{name='" + name + "', credits=" + credits + "}";
    }
}