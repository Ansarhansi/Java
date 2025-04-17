package internal;

public class AnimalType {
    private String species;
    private String habitat;

    public AnimalType(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }

    public void survive() {
        System.out.println(species + " survives in " + habitat);
    }

    public String toString() {
        return "AnimalType{species='" + species + "', habitat='" + habitat + "'}";
    }
}