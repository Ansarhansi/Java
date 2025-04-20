package Internal2;

import java.util.Objects;

public class Book {
    private String color;
    private int cost;
    private String author;
    private double thickness;

    public Book(String color, int cost, String author, double thickness) {
        this.color = color;
        this.cost = cost;
        this.author = author;
        this.thickness = thickness;
    }

    public String toString() {
        return "Book{" + "color='" + color + '\'' + ", cost=" + cost + ", author='" + author + '\'' + ", thickness=" + thickness + '}';
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Book) {
            if (Objects.equals(this.color, ((Book) obj).color) &&
                    Objects.equals(this.cost, ((Book) obj).cost)) {
                System.out.println("Book is matching...");
                return true;
            }
        }
        return false;
    }
}
