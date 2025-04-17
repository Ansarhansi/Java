import internal.*;

public class April3 {
    public static void main(String[] args) {
        Currency c = new Currency();
        c.setName("Rupee");
        c.setCountry("India");
        c.printInfo();
        System.out.println(c);

        Art a = new Art();
        a.setStyle("Modern");
        a.setArtist("Raza");
        a.exhibit();
        System.out.println(a);

        Notification n = new Notification();
        n.setType("Email");
        n.setMessage("Welcome!");
        n.alert();
        System.out.println(n);

        Festival f = new Festival();
        f.setName("Diwali");
        f.setMonth("November");
        f.celebrate();
        System.out.println(f);

        Language l = new Language();
        l.setName("Hindi");
        l.setFamily("Indo-Aryan");
        l.speak();
        System.out.println(l);

        Engine e = new Engine();
        e.setModel("V8");
        e.setPower(450);
        e.start();
        System.out.println(e);

        Insurance ins = new Insurance();
        ins.setType("Health");
        ins.setPremium(5000);
        ins.activate();
        System.out.println(ins);

        Game g = new Game();
        g.setTitle("Chess");
        g.setGenre("Strategy");
        g.play();
        System.out.println(g);

        Garden ga = new Garden();
        ga.setArea(250);
        ga.setPlants(60);
        ga.grow();
        System.out.println(ga);

        Rocket r = new Rocket();
        r.setName("GSLV");
        r.setSpeed(28000);
        r.launch();
        System.out.println(r);

        Course co = new Course();
        co.setTitle("Java");
        co.setDuration(12);
        co.enroll();
        System.out.println(co);

        Dessert d = new Dessert();
        d.setName("Gulab Jamun");
        d.setSweet(true);
        d.serve();
        System.out.println(d);

        Printer p = new Printer();
        p.setBrand("HP");
        p.setColor(true);
        p.print();
        System.out.println(p);

        Lamp la = new Lamp();
        la.setType("LED");
        la.setWatts(15);
        la.lightUp();
        System.out.println(la);

        Bridge b = new Bridge();
        b.setLocation("Kolkata");
        b.setLength(7050);
        b.cross();
        System.out.println(b);

        Airline al = new Airline();
        al.setName("IndiGo");
        al.setFleetSize(275);
        al.fly();
        System.out.println(al);

        Shoes s = new Shoes();
        s.setBrand("Nike");
        s.setSize(9);
        s.wear();
        System.out.println(s);

        Clock cl = new Clock();
        cl.setType("Digital");
        cl.setTimezone("IST");
        cl.showTime();
        System.out.println(cl);

        Cloud cloud = new Cloud();
        cloud.setProvider("AWS");
        cloud.setStorage(1000);
        cloud.upload();
        System.out.println(cloud);

        Restaurant res = new Restaurant();
        res.setName("Barbeque Nation");
        res.setCuisine("Indian");
        res.serveFood();
        System.out.println(res);

        CurrencyExchange ce = new CurrencyExchange();
        ce.setFromCurrency("USD");
        ce.setToCurrency("INR");
        ce.exchange();
        System.out.println(ce);

        Membership m = new Membership();
        m.setType("Gold");
        m.setDuration(12);
        m.activate();
        System.out.println(m);

        Delivery del = new Delivery();
        del.setService("Amazon");
        del.setFast(true);
        del.deliver();
        System.out.println(del);

        Clothing clo = new Clothing();
        clo.setType("T-Shirt");
        clo.setSize("M");
        clo.wear();
        System.out.println(clo);

        Hospital h = new Hospital();
        h.setName("Apollo");
        h.setBeds(500);
        h.admitPatient();
        System.out.println(h);
    }
}
