package internal;

public class University {
    private String name;
    private int students;

    public University(String name, int students) {
        this.name = name;
        this.students = students;
    }

    public void enroll() {
        System.out.println(name + " University is enrolling " + students + " students.");
    }

    public String toString() {
        return "University{name='" + name + "', students=" + students + "}";
    }
}