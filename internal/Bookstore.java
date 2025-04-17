package internal;

public class Bookstore {
    private String name;
    private int books;

    public Bookstore(String name, int books) {
        this.name = name;
        this.books = books;
    }

    public void sellBooks() {
        System.out.println(name + " bookstore is selling " + books + " books.");
    }

    public String toString() {
        return "Bookstore{name='" + name + "', books=" + books + "}";
    }
}