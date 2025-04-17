package internal;

public class Runner2 {
    public static void main(String[] args) {
        // Example for 3 classes
        Employee e = new Manager();
        e.describe();
        ((Manager) e).conductMeeting();

        Instrument i = new Guitar();
        i.describe();
        ((Guitar) i).playChords();

        Furniture f = new Chair();
        f.describe();
        ((Chair) f).adjustHeight();

        Beverage b = new Coffee();
        b.describe();
        ((Coffee) b).stir();

        OperatingSystem os = new Linux();
        os.describe();
        ((Linux) os).runShell();

        PaymentMethod pm = new CreditCard();
        pm.describe();
        ((CreditCard) pm).swipe();

        Sport s = new Football();
        s.describe();
        ((Football) s).kick();

        Plant p = new Rose();
        p.describe();
        ((Rose) p).bloom();

        CloudService cs = new AWS();
        cs.describe();
        ((AWS) cs).deploy();

        Camera cam = new DSLR();
        cam.describe();
        ((DSLR) cam).takePhoto();

        Transport t = new Train();
        t.describe();
        ((Train) t).whistle();

        Software sw = new Antivirus();
        sw.describe();
        ((Antivirus) sw).scan();

        Language lang = new English();
        lang.describe();
        ((English) lang).speak();

        Bank bk = new HDFCBank();
        bk.describe();
        ((HDFCBank) bk).offerLoan();

        Currency cur = new Dollar();
        cur.describe();
        ((Dollar) cur).exchange();

        Weapon wp = new Sword();
        wp.describe();
        ((Sword) wp).slash();

        Festival fest = new Diwali();
        fest.describe();
        ((Diwali) fest).lightLamps();

        Planet pl = new Earth();
        pl.describe();
        ((Earth) pl).rotate();

        Clothing cloth = new Tshirt();
        cloth.describe();
        ((Tshirt) cloth).wear();

        Vehicle bike = new Bicycle();
        bike.describe();
        ((Bicycle) bike).pedal();
    }
}
