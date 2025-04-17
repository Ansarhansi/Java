package internal;

public class Book {
    private String title;
    private String author;

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }

    public void read() {
        System.out.println("Book is being read");
    }

    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}
