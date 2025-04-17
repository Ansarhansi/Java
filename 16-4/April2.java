package internal;

public class April2 {
    public static void main(String[] args) {

        // Constructor-Based Classes
        Planet p = new Planet("Earth", 12742);
        p.orbit();
        System.out.println(p);

        Scientist sci = new Scientist("Physics", 12);
        sci.research();
        System.out.println(sci);

        AnimalType at = new AnimalType("Tiger", "Forest");
        at.survive();
        System.out.println(at);

        Fashion fash = new Fashion("Casual", "Summer");
        fash.show();
        System.out.println(fash);

        Subject sub = new Subject("Mathematics", 4);
        sub.study();
        System.out.println(sub);

        Drink dr = new Drink("Coca-Cola", true);
        dr.consume();
        System.out.println(dr);

        Weather w = new Weather("Sunny", 32.5);
        w.display();
        System.out.println(w);

        Metal m = new Metal("Iron", 7.87);
        m.melt();
        System.out.println(m);

        Software soft = new Software("Photoshop", "24.1");
        soft.run();
        System.out.println(soft);

        GameConsole gc = new GameConsole("PlayStation", true);
        gc.playGame();
        System.out.println(gc);

        // Setter-Based Classes
        Flower fl = new Flower();
        fl.setColor("Pink");
        fl.setType("Rose");
        fl.bloom();
        System.out.println(fl);

        EngineType et = new EngineType();
        et.setFuelType("Diesel");
        et.setHorsepower(200);
        et.start();
        System.out.println(et);

        School sch = new School();
        sch.setName("Sunrise Public School");
        sch.setStudents(450);
        sch.operate();
        System.out.println(sch);

        City city = new City();
        city.setName("Mumbai");
        city.setPopulation(20400000);
        city.grow();
        System.out.println(city);

        SeaCreature sc = new SeaCreature();
        sc.setName("Jellyfish");
        sc.setIsVenomous(true);
        sc.swim();
        System.out.println(sc);

        Element el = new Element();
        el.setSymbol("O");
        el.setAtomicNumber(8);
        el.react();
        System.out.println(el);

        ProfessionType pt = new ProfessionType();
        pt.setTitle("Engineer");
        pt.setIndustry("IT");
        pt.perform();
        System.out.println(pt);

        Material mat = new Material();
        mat.setName("Wood");
        mat.setUse("Furniture Making");
        mat.apply();
        System.out.println(mat);

        Furniture fur = new Furniture();
        fur.setType("Chair");
        fur.setMaterial("Plastic");
        fur.place();
        System.out.println(fur);

        ModeOfTransport mot = new ModeOfTransport();
        mot.setMode("Train");
        mot.setCapacity(1000);
        mot.move();
        System.out.println(mot);
    }
}
