package internal;

public class Scientist {
    private String field;
    private int experience;

    public Scientist(String field, int experience) {
        this.field = field;
        this.experience = experience;
    }

    public void research() {
        System.out.println("Researching in " + field);
    }

    public String toString() {
        return "Scientist{field='" + field + "', experience=" + experience + " years}";
    }
}