import internal.*;

public class April4 {
    public static void main(String[] args) {
        Platform p = new Platform("Instagram", "Social Media");
        p.displayPlatform();
        System.out.println(p);

        Skill s = new Skill("Java", 5);
        s.showSkill();
        System.out.println(s);

        Theater t = new Theater("National Theater", 500);
        t.showPerformance();
        System.out.println(t);

        Market m = new Market("Central Market", "City");
        m.openMarket();
        System.out.println(m);

        Network n = new Network("Facebook", 2000000);
        n.connect();
        System.out.println(n);

        Shop sh = new Shop("Tech Store", "Electronics");
        sh.openShop();
        System.out.println(sh);

        Recipe r = new Recipe("Pasta", "Pasta, Sauce, Cheese");
        r.cook();
        System.out.println(r);

        House h = new House("123 Main St", 4);
        h.showHouse();
        System.out.println(h);

        Decoration d = new Decoration("Modern", "Blue");
        d.decorate();
        System.out.println(d);

        University u = new University("Oxford", 20000);
        u.enroll();
        System.out.println(u);

        TransportSystem ts = new TransportSystem("Public", 1000);
        ts.transport();
        System.out.println(ts);

        Oil o = new Oil("Crude", 5000);
        o.refine();
        System.out.println(o);

        Newspaper np = new Newspaper("Times", "01/01/2025");
        np.printNews();
        System.out.println(np);

        Bookstore bs = new Bookstore("City Books", 1000);
        bs.sellBooks();
        System.out.println(bs);

        InsurancePolicy ip = new InsurancePolicy("Health", 1000);
        ip.issuePolicy();
        System.out.println(ip);

        SolarSystem ss = new SolarSystem("Milky Way", 8);
        ss.explore();
        System.out.println(ss);

        Volcano v = new Volcano("Mount Fuji", "Active");
        v.erupt();
        System.out.println(v);

        FurnitureType ft = new FurnitureType("Chair", "Wood");
        ft.describe();
        System.out.println(ft);

        TransportationMode tm = new TransportationMode("Train", 300);
        tm.travel();
        System.out.println(tm);

        EducationSystem es = new EducationSystem("IB", "USA");
        es.educate();
        System.out.println(es);

        Trade tr = new Trade("Gold", 1000000);
        tr.conductTrade();
        System.out.println(tr);

        ECommerce ec = new ECommerce("Amazon", 300000);
        ec.sell();
        System.out.println(ec);

        Company c = new Company("Google", 100000);
        c.operate();
        System.out.println(c);

        Waste w = new Waste("Plastic", 500);
        w.dispose();
        System.out.println(w);

        Industry i = new Industry("Automobile", 5000);
        i.produce();
        System.out.println(i);
    }
}