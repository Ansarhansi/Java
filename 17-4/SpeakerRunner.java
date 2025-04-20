package Internal2;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker s1 = new Speaker("Black", 3000, "JBL", 20);
        Speaker s2 = new Speaker("Black", 3000, "Sony", 25);
        Speaker s3 = new Speaker("White", 3500, "Boat", 30);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Speaker match: " + s1.equals(s2));
        System.out.println("Speaker not match: " + s1.equals(s3));
    }
}

