package Internal2;

public class SunglassRunner {
    public static void main(String[] args) {
        Sunglass s1 = new Sunglass("Black", 1200, "RayBan", true);
        Sunglass s2 = new Sunglass("Black", 1200, "Fastrack", false);
        Sunglass s3 = new Sunglass("Blue", 1000, "Oakley", true);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Sunglass match: " + s1.equals(s2));
        System.out.println("Sunglass not match: " + s1.equals(s3));
    }
}
