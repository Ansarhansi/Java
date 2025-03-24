public class ClothesBrandNames {
    static int index = 0;
    static String[] brandNames = {null, null, null, null};

    public static void addBrand(String name) {
        if (brandNames != null) {
            if (index < brandNames.length) {
                brandNames[index] = name;
                index++;
                System.out.println("Brand added successfully");
            } else {
                System.out.println("List is full, cannot add");
            }
        } else {
            System.out.println("brandNames is null");
        }
    }

    public static void displayBrands() {
        for (String brand : brandNames) {
            System.out.println(brand);
        }
    }
}