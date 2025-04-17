package internal;

public class Fashion {
    private String style;
    private String season;

    public Fashion(String style, String season) {
        this.style = style;
        this.season = season;
    }

    public void show() {
        System.out.println("Fashion style for " + season + ": " + style);
    }

    public String toString() {
        return "Fashion{style='" + style + "', season='" + season + "'}";
    }
}