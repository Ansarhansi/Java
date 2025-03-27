public class ProductName {
    static int index = 0;
    static String[] pName = {null, null, null, null};
    public static void displayName() {
        for (int i = 0; i < pName.length; i++) {
            System.out.println("Index " + i + ": " + pName[i]);
       }}
      public static void searchProduct(String target) {
        boolean found = false;
        for (int i = 0; i < pName.length; i++) {
            if (target.equals(pName[i])) {
                System.out.println("Target element is present at index " + i + ": " + target);
                found = true;
                break;
            }}}
       public static void update(String pname) {
        boolean updated = false;
        for (int i = 0; i < pName.length; i++) {
            if (pname.equalsIgnoreCase(pName[i])) {
                pName[i] = "Iphone"; 
                System.out.println("Element updated successfully at index " + i);
                updated = true;
                break;
            }
        }
        if (!updated) {
            System.out.println("Element not found: " + pname);
        }}
    public static void delete(String pname) {
        // boolean deleted = false;
        for (int i = 0; i < pName.length; i++) {
            if (pname.equalsIgnoreCase(pName[i])) {
                pName[i] = null; 
                System.out.println("Element deleted successfully at index " + i);
                // deleted = true;
                break;
            }}
            if (!deleted) {
            System.out.println("Element not found: " + pname);
        }}}
 