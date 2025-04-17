package internal;

public class Course {
    private String title;
    private int duration;

    public void setTitle(String title) { this.title = title; }
    public void setDuration(int duration) { this.duration = duration; }

    public void enroll() {
        System.out.println("Enrolled in " + title + " course for " + duration + " weeks");
    }

    public String toString() {
        return "Course{title='" + title + "', duration=" + duration + " weeks}";
    }
}
