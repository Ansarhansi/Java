public class LaptopType{ 
	public static void config(int ramsize){
		System.out.println("Laptop config:");

	}
	 public static void config(int ramSize, int storageSize) {
        System.out.println(" " + ramSize + " " + storageSize);
    }

    public static void config(int ramSize, String processorType) {
        System.out.println(" " + ramSize + " " + processorType);
    }

    public static void config(int ramSize, int storageSize, String processorType) {
        System.out.println(" "+ ramSize+" "+storageSize+" "+processorType);
    }
}