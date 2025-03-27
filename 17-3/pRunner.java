 public class pRunner{
public static void main(String[] args) {
       ProductName.pName[0] = "Watch";
        ProductName.pName[1] = "Laptop";
       ProductName.pName[2] = "Phone";

        ProductName.displayName();

        ProductName.searchProduct("Watch");
        ProductName.update("Laptop");
         ProductName.displayName();

        ProductName.delete("phone");

        ProductName.displayName();


    }
        
       }
