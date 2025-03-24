class Item {
    static String name;
    static double price;
    static double totalPriceWithGST;

    public void setDetails(String itemName, double itemPrice) {
        name = itemName;
        price = itemPrice;
        totalPriceWithGST = itemPrice + GST_Calc.calc_Gst(itemPrice);
    }

    public void setDetails() {
        System.out.println("Item Name: " + name);
        System.out.println("Price without GST: " + price);
        System.out.println("Price with GST: " + totalPriceWithGST);
    }

    public void setDetails(String brandName, String itemName, double price) {
        if (brandName.equals("Frill and Thrill")) {
            price *= 0.50; 
        }
        double gstAmount = GST_Calc.calc_Gst(price);
        double finalPrice = price + gstAmount;
        System.out.println("Brand: " + brandName + ", Item: " + itemName);
        System.out.println("Price after Discount: " + price);
        System.out.println("GST Amount: " + gstAmount);
        System.out.println("Final Price with GST: " + finalPrice);
    }

    public void setDetails(double[] prices) {
        System.out.println("Calculating GST for an array of prices:");
        for (double price : prices) {
            // Use the correct method name
            double gstAmount = GST_Calc.calc_Gst(price);
            double finalPrice = price + gstAmount;
            System.out.println("Original Price: " + price);
            System.out.println("GST Amount: " + gstAmount);
            System.out.println("Final Price (with GST): " + finalPrice);
        }
    }
}
