package internal;

public class Industry {
    private String name;
    private int workers;

    public Industry(String name, int workers) {
        this.name = name;
        this.workers = workers;
    }

    public void produce() {
        System.out.println(name + " industry is producing goods with " + workers + " workers.");
    }

    public String toString() {
        return "Industry{name='" + name + "', workers=" + workers + "}";
    }
}