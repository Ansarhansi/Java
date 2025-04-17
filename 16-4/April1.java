package internal;

public class April1{
    public static void main(String[] args) {

        // Constructor Initialization
        Teacher t1 = new Teacher("Mr. Smith", "Math");
        t1.teach();
        System.out.println(t1);

        Bank b1 = new Bank("HDFC", 120);
        b1.openAccount();
        System.out.println(b1);

        Music m1 = new Music("Jazz", 5);
        m1.play();
        System.out.println(m1);

        Building build = new Building("Residential", 10);
        build.construct();
        System.out.println(build);

        Movie movie = new Movie("Inception", "Sci-fi");
        movie.watch();
        System.out.println(movie);

        Country c = new Country("India", 1400000000);
        c.displayInfo();
        System.out.println(c);

        Pet pet = new Pet("Dog", "Max");
        pet.sound();
        System.out.println(pet);

        Profession p = new Profession("Engineer", 60000);
        p.work();
        System.out.println(p);

        Tree tree = new Tree("Oak", 25);
        tree.grow();
        System.out.println(tree);

        Machine mac = new Machine("Printer", "Printing");
        mac.operate();
        System.out.println(mac);


        // Setters and Getters Initialization
        Appliance app = new Appliance();
        app.setType("Microwave");
        app.setWattage(1200);
        app.use();
        System.out.println(app);

        Account acc = new Account();
        acc.setHolder("John Doe");
        acc.setBalance(1000.75);
        acc.showBalance();
        System.out.println(acc);

        Camera cam = new Camera();
        cam.setBrand("Canon");
        cam.setMegapixels(24);
        cam.capture();
        System.out.println(cam);

        Instrument inst = new Instrument();
        inst.setType("Guitar");
        inst.setMaterial("Wood");
        inst.play();
        System.out.println(inst);

        Food food = new Food();
        food.setName("Pizza");
        food.setCalories(300);
        food.eat();
        System.out.println(food);

        Student stud = new Student();
        stud.setName("Alex");
        stud.setRollNo(12);
        stud.study();
        System.out.println(stud);

        App application = new App();
        application.setName("WhatsApp");
        application.setVersion(2.23);
        application.run();
        System.out.println(application);

        Organization org = new Organization();
        org.setName("Google");
        org.setType("Tech");
        org.operate();
        System.out.println(org);

        Room room = new Room();
        room.setName("Conference");
        room.setArea(250);
        room.clean();
        System.out.println(room);
    }
}
