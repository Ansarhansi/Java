package internal;

public class Food {
    private String name;
    private int calories;

    public void setName(String name) { this.name = name; }
    public void setCalories(int calories) { this.calories = calories; }

    public void eat() {
        System.out.println("Eating " + name);
    }

    public String toString() {
        return "Food{name='" + name + "', calories=" + calories + "}";
    }
}
