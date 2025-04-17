package internal;

public class Tree {
    private String name;
    private int height;

    public Tree(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void grow() {
        System.out.println(name + " tree is growing.");
    }

    public String toString() {
        return "Tree{name='" + name + "', height=" + height + "ft}";
    }
}
