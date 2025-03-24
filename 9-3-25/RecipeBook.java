 public class RecipeBook {
    public void addRecipe(String name, String ingredients) {
        System.out.println("Recipe added: " + name);
    }

    public void addRecipe(String name, String[] ingredients) {
        System.out.println("Recipe added: " + name + " with multiple ingredients.");
    }
}
