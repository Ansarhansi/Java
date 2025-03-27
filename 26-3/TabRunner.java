public class TabRunner {
    public static void main(String[] args) {
        Tab t1 = new Tab(101, "TabX", "BrandA", "ModelA", "Android 12", "Quad-Core", 128, 6, 10, "1920x1080", 6000, 
                         "Wi-Fi & LTE", true, true, 12, true, true, "Black", 30000, true);
        Tab t2 = new Tab(102, "TabY", "BrandB", "ModelB", "iOS 16", "snapdragon", 256, 8, 11, "2388x1668", 7500, 
                         "Wi-Fi & Cellular", true, true, 10, true, true, "Silver", 50000, false);
        Tab t3 = new Tab(103, "TabZ", "BrandC", "ModelC", "Windows 11", "Octa-Core", 512, 16, 12, "2736x1824", 8000, 
                         "Wi-Fi only", true, true, 15, true, true, "Gray", 70000, true);

        System.out.println("Tab 1");


        System.out.println("ID: " + t1.id);
        System.out.println("Name: " + t1.name);
        System.out.println("Brand: " + t1.brand);
        System.out.println("Model: " + t1.model);
        System.out.println("Operating System: " + t1.operatingSystem);
        System.out.println("Processor: " + t1.processor);
        System.out.println("Storage Capacity: " + t1.storageCapacity);
        System.out.println("RAM: " + t1.ram);
        System.out.println("Screen Size: " + t1.screenSize);
        System.out.println("Resolution: " + t1.resolution);
        System.out.println("Battery Capacity: " + t1.batteryCapacity);
        System.out.println("Connectivity: " + t1.connectivity);
        System.out.println("Is Touch Screen: " + t1.isTouchScreen);
        System.out.println("Has Camera: " + t1.hasCamera);
        System.out.println("Camera Resolution: " + t1.cameraResolution);
        System.out.println("Has GPS: " + t1.hasGPS);
        System.out.println("Has Bluetooth: " + t1.hasBluetooth);
        System.out.println("Color: " + t1.color);
        System.out.println("Price: " + t1.price);
        System.out.println("Is On Sale: " + t1.isOnSale);

        System.out.println(" ");
        System.out.println("ID: " + t2.id);
        System.out.println("Name: " + t2.name);
        System.out.println("Brand: " + t2.brand);
        System.out.println("Model: " + t2.model);
        System.out.println("Operating System: " + t2.operatingSystem);
        System.out.println("Processor: " + t2.processor);
        System.out.println("Storage Capacity: " + t2.storageCapacity);
        System.out.println("RAM: " + t2.ram);
        System.out.println("Screen Size: " + t2.screenSize);
        System.out.println("Resolution: " + t2.resolution);
        System.out.println("Battery Capacity: " + t2.batteryCapacity);
        System.out.println("Connectivity: " + t2.connectivity);
        System.out.println("Is Touch Screen: " + t2.isTouchScreen);
        System.out.println("Has Camera: " + t2.hasCamera);
        System.out.println("Camera Resolution: " + t2.cameraResolution);
        System.out.println("Has GPS: " + t2.hasGPS);
        System.out.println("Has Bluetooth: " + t2.hasBluetooth);
        System.out.println("Color: " + t2.color);
        System.out.println("Price: " + t2.price);
        System.out.println("Is On Sale: " + t2.isOnSale);
        System.out.println(" ");

        System.out.println("ID: " + t3.id);
        System.out.println("Name: " + t3.name);
        System.out.println("Brand: " + t3.brand);
        System.out.println("Model: " + t3.model);
        System.out.println("Operating System: " + t3.operatingSystem);
        System.out.println("Processor: " + t3.processor);
        System.out.println("Storage Capacity: " + t3.storageCapacity);
        System.out.println("RAM: " + t3.ram);
        System.out.println("Screen Size: " + t3.screenSize);
        System.out.println("Resolution: " + t3.resolution);
        System.out.println("Battery Capacity: " + t3.batteryCapacity);
        System.out.println("Connectivity: " + t3.connectivity);
        System.out.println("Is Touch Screen: " + t3.isTouchScreen);
        System.out.println("Has Camera: " + t3.hasCamera);
        System.out.println("Camera Resolution: " + t3.cameraResolution);
        System.out.println("Has GPS: " + t3.hasGPS);
        System.out.println("Has Bluetooth: " + t3.hasBluetooth);
        System.out.println("Color: " + t3.color);
        System.out.println("Price: " + t3.price);
        System.out.println("Is On Sale: " + t3.isOnSale);
        System.out.println(" ");

        
    }
}