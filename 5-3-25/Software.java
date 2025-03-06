public class Software {
  
    static String name;
    static String version;
    static String developer;

    
    

    public static void displayInfo() {
        name = "IBM Watson";
        version = "3.2.1";
        developer = "IBM Corporation";

        System.out.println("Software Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Developer: " + developer);
    }



    public static void main(String[] args) {
        
        Software.displayInfo();
        
    }
}
