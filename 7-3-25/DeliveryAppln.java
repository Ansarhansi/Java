Apublic class DeliveryAppln {

    static String[] deliveryname = {null, null, null, null};
    static int index = 0;

    public static void displayName() {
        System.out.println("Current applications:");
        for (int i = 0; i < deliveryname.length; i++) {
            
                System.out.println(deliveryname[i]);
            
        }
    }

    public static boolean searchName(String appname) {
        for (int i = 0; i < index; i++) {
            if (deliveryname[i] != null && deliveryname[i].equalsIgnoreCase(appname)) {
                System.out.println( appname);
                return true;
            }
        }
        return false;
    }

    public static void listOfApplication(String appname) {
        if (deliveryname != null) {
            if (searchName(appname)) {
                System.out.println("App name already exists: " + appname);
            } else if (index < deliveryname.length) {
                deliveryname[index] = appname;
                index++;
                System.out.println("App added successfully: " + appname);
            } else {
                System.out.println("List is full, cannot add: " + appname);
            }
        } else {
            System.out.println("DeliveryApp is null.");
        }
    }
}