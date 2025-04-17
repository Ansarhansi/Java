package internal;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
