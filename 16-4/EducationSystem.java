package internal;

public class EducationSystem {
    private String name;
    private String country;

    public EducationSystem(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public void educate() {
        System.out.println(name + " system is educating students in " + country + ".");
    }

    public String toString() {
        return "EducationSystem{name='" + name + "', country='" + country + "'}";
    }
}