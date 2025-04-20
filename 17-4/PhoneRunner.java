package Internal2;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Black", 20000, "Samsung", 6.4);
        Phone phone2 = new Phone("Black", 20000, "Realme", 6.4);
        Phone phone3 = new Phone("Black", 20000, "Samsung", 6.4);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println("Phone match: " + phone1.equals(phone3));
        System.out.println("Phone not match: " + phone1.equals(phone2));
    }
}
