package internal;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Animal speaks");
    }

    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }
}
