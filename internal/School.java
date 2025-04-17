package internal;

public class School {
    private String name;
    private int students;

    public void setName(String name) { this.name = name; }
    public void setStudents(int students) { this.students = students; }

    public void operate() {
        System.out.println(name + " school is now open.");
    }

    public String toString() {
        return "School{name='" + name + "', students=" + students + "}";
    }
}
