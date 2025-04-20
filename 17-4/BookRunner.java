package Internal2;

public class BookRunner {
    public static void main(String[] args) {
        Book book1 = new Book("Blue", 300, "Author", 2.5);
        Book book2 = new Book("Blue", 300, "Writer", 2.5);
        Book book3 = new Book("Blue", 300, "Author", 2.5);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("Book match: " + book1.equals(book3));
        System.out.println("Book not match: " + book1.equals(book2));
    }
}
