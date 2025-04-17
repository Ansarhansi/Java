package internal;

public class Movie {
    private String title;
    private String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public void watch() {
        System.out.println("Watching movie: " + title);
    }

    public String toString() {
        return "Movie{title='" + title + "', genre='" + genre + "'}";
    }
}
