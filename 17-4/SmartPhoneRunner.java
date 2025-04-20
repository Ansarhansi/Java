package Internal2;

public class SmartPhoneRunner {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Samsung", 30000, 6.5, 4000);
        Smartphone s2 = new Smartphone("Samsung", 30000, 6.2, 3800);
        Smartphone s3 = new Smartphone("Apple", 35000, 6.1, 3500);

//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        System.out.println("Smartphone match: " + s1.equals(s2));
        System.out.println("Smartphone not match: " + s1.equals(s3));
    }
}
