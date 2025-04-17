package internal;

public class ProfessionType {
    private String title;
    private String industry;

    public void setTitle(String title) { this.title = title; }
    public void setIndustry(String industry) { this.industry = industry; }

    public void perform() {
        System.out.println("Performing duties as " + title + " in " + industry);
    }

    public String toString() {
        return "ProfessionType{title='" + title + "', industry='" + industry + "'}";
    }
}
