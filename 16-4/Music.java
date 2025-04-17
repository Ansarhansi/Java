package internal;

public class Music {
    private String genre;
    private int duration;

    public Music(String genre, int duration) {
        this.genre = genre;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing " + genre + " music for " + duration + " mins");
    }

    public String toString() {
        return "Music{genre='" + genre + "', duration=" + duration + " mins}";
    }
}
