package internal;

public class Runner5 {
    public static void main(String[] args) {
        Currency cur = new Currency();
        cur.describe();
        Currency bit = new Bitcoin();
        bit.describe();
        Bitcoin btc = new Bitcoin();
        btc.describe();


        Art art = new Art();
        art.display();
        Art painting = new Painting();
        painting.display();
        Painting p = new Painting();
        p.display();
        p.frame();

        Notification1 n = new EmailNotification();
        n.send();
        EmailNotification email = new EmailNotification();
        email.send();
        email.attachFile();


        Language l = new French();
        l.speak();
        French f = new French();
        f.speak();
        f.translate();



        Insurance ins = new HealthInsurance();
        ins.insure();
        HealthInsurance hi = new HealthInsurance();
        hi.insure();
        hi.claim();

        Game g = new Cricket();
        g.start();
        Cricket cricket = new Cricket();
        cricket.start();
        cricket.score();

        Garden garden = new RoseGarden();
        garden.maintain();
        RoseGarden rose = new RoseGarden();
        rose.maintain();
        rose.plantRoses();

        Rocket r = new SpaceX();
        r.launch();
        SpaceX s = new SpaceX();
        s.launch();
        s.reuse();

        Course c = new OnlineCourse();
        c.enroll();
        OnlineCourse oc = new OnlineCourse();
        oc.enroll();
        oc.attendLive();

        Dessert dss = new Cake();
        dss.sweeten();
        Cake cake = new Cake();
        cake.sweeten();
        cake.bake();

        Printer pr = new LaserPrinter();
        pr.print();
        LaserPrinter lp = new LaserPrinter();
        lp.print();
        lp.refillToner();

        Lamp lamp = new LEDLamp();
        lamp.glow();
        LEDLamp led = new LEDLamp();
        led.glow();
        led.saveEnergy();

        Bridge b = new SuspensionBridge();
        b.construct();
        SuspensionBridge sb = new SuspensionBridge();
        sb.construct();
        sb.supportCables();

        Airline air = new Emirates();
        air.fly();
        Emirates emirates = new Emirates();
        emirates.fly();
        emirates.serveMeal();

        Shoes sh = new Sneakers();
        sh.wear();
        Sneakers sn = new Sneakers();
        sn.wear();
        sn.tieLaces();

        Clock clk = new DigitalClock();
        clk.tick();
        DigitalClock dclk = new DigitalClock();
        dclk.tick();
        dclk.setAlarm();

        Cloud cloud = new GoogleDrive();
        cloud.store();
        GoogleDrive gd = new GoogleDrive();
        gd.store();
        gd.sync();

        Restaurant rest = new ItalianRestaurant();
        rest.serveFood();
        ItalianRestaurant ir = new ItalianRestaurant();
        ir.serveFood();
        ir.playMusic();

        CurrencyExchange ce = new Forex();
        ce.convert();
        Forex forex = new Forex();
        forex.convert();
        forex.analyzeRates();
    }
}
