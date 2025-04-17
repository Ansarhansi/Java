package internal;

public class Art {
    private String style;
    private String artist;

    public void setStyle(String style) { this.style = style; }
    public void setArtist(String artist) { this.artist = artist; }

    public void exhibit() {
        System.out.println("Exhibiting " + style + " by " + artist);
    }

    public String toString() {
        return "Art{style='" + style + "', artist='" + artist + "'}";
    }
}
