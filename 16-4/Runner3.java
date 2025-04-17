package internal;

public class Runner3 {
    public static void main(String[] args) {


        Building b = new Skyscraper();
        b.describe();
        ((Skyscraper) b).reachSky();

        Machine m = new WashingMachine();
        m.describe();
        ((WashingMachine) m).washClothes();

        Website w = new EcommerceSite();
        w.describe();
        ((EcommerceSite) w).listProducts();

        Tool t = new Hammer();
        t.describe();
        ((Hammer) t).hit();

        File f = new PDFFile();
        f.describe();
        ((PDFFile) f).openPDF();

        Toy toy = new RobotToy();
        toy.describe();
        ((RobotToy) toy).move();

        Service svc = new DeliveryService();
        svc.describe();
        ((DeliveryService) svc).deliverParcel();

        Document doc = new Resume();
        doc.describe();
        ((Resume) doc).printResume();

        Browser br = new Chrome();
        br.describe();
        ((Chrome) br).openTab();

        Engine en = new DieselEngine();
        en.describe();
        ((DieselEngine) en).startEngine();

        Message msg = new Email();
        msg.describe();
        ((Email) msg).sendEmail();



        Book bk = new Novel();
        bk.describe();
        ((Novel) bk).readStory();

        Gadget g = new Smartwatch();
        g.describe();
        ((Smartwatch) g).trackSteps();

        Profession pro = new Doctor();
        pro.describe();
        ((Doctor) pro).treatPatient();

        Festival f1 = new Christmas();
        f1.describe();
        ((Christmas) f1).decorateTree();

        Appliance app = new Microwave();
        app.describe();
        ((Microwave) app).heatFood();

        Notification noti = new SMS();
        noti.describe();
        ((SMS) noti).sendSMS();

        Membership mem = new PremiumMembership();
        mem.describe();
        ((PremiumMembership) mem).accessExclusiveContent();
    }
}
