package internal;

public class Recipe {
    private String name;
    private String ingredients;

    public Recipe(String name, String ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public void cook() {
        System.out.println("Cooking " + name + " with ingredients: " + ingredients);
    }

    public String toString() {
        return "Recipe{name='" + name + "', ingredients='" + ingredients + "'}";
    }
}