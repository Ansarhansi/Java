package internal;

public class April {
    public static void main(String[] args) {

        // Classes initialized using Constructor
        Animal a = new Animal("Dog", 5);
        a.speak();
        System.out.println(a);

        Vehicle v = new Vehicle("Toyota", 120);
        v.drive();
        System.out.println(v);

        Employee e = new Employee("Alice", 50000);
        e.work();
        System.out.println(e);

        Device d = new Device("X100", "Samsung");
        d.operate();
        System.out.println(d);

        Shape s = new Shape("Triangle", 3);
        s.draw();
        System.out.println(s);


        // Classes initialized using Setters
        Book b = new Book();
        b.setTitle("Java Programming");
        b.setAuthor("James Gosling");
        b.read();
        System.out.println(b);

        Account acc = new Account();
        acc.setHolder("John Doe");
        acc.setBalance(1000.75);
        acc.showBalance();
        System.out.println(acc);

        Appliance app = new Appliance();
        app.setType("Microwave");
        app.setWattage(1200);
        app.use();
        System.out.println(app);

        Fruit f = new Fruit();
        f.setName("Apple");
        f.setColor("Red");
        f.taste();
        System.out.println(f);

        Tool t = new Tool();
        t.setToolName("Hammer");
        t.setWeight(1.5);
        t.useTool();
        System.out.println(t);
    }
}
