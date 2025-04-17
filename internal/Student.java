package internal;

public class Student {
    private String name;
    private int rollNo;

    public void setName(String name) { this.name = name; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }
}
