public class ProductDetails{

	public static void main(String args[])
	{
	 System.out.println("Products details are ");
	 String pName="Laptop";
	 int price=56000;
	 long discount=12000l;
	 String bName="ASUS";
	 byte  gst=3;
	int donation=5;
	 int d_fee=40;
	 int p_fee=350;
	 int TP_Amount=(price+gst+donation+d_fee+p_fee);
	 int w_Gst=(price+donation+d_fee+p_fee);

     System.out.println("Products Name is :"+ pName );
     System.out.println("product price is :"+ price );
     System.out.println("product Brand name  is :"+ bName );
     

     System.out.println("Total payable Amount is: "+TP_Amount);
     System.out.println("Total payable Amount with gst: "+(TP_Amount+(TP_Amount*3/100))
 );
     System.out.println("Actual payable Amount:"+ (price-discount));
     System.out.println("Amount payable is:"+ (w_Gst));



	}
}