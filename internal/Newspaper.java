package internal;

public class Newspaper {
    private String name;
    private String date;

    public Newspaper(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public void printNews() {
        System.out.println(name + " newspaper, dated " + date + ", is now printed.");
    }

    public String toString() {
        return "Newspaper{name='" + name + "', date='" + date + "'}";
    }
}