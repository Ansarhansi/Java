public class Skill {
    private String name;
    private int level;

    public Skill(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void showSkill() {
        System.out.println("Skill: " + name + ", Level: " + level);
    }

    public String toString() {
        return "Skill{name='" + name + "', level=" + level + "}";
    }
}