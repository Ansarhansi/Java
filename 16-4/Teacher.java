package internal;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }

    public String toString() {
        return "Teacher{name='" + name + "', subject='" + subject + "'}";
    }
}
