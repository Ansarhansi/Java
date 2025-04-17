package internal;

public class Game {
    private String title;
    private String genre;

    public void setTitle(String title) { this.title = title; }
    public void setGenre(String genre) { this.genre = genre; }

    public void play() {
        System.out.println("Playing " + genre + " game: " + title);
    }

    public String toString() {
        return "Game{title='" + title + "', genre='" + genre + "'}";
    }
}
