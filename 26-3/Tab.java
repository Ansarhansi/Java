class Tab {
    int id;
    String name;
    String brand;
    String model;
    String operatingSystem;
    String processor;
    int storageCapacity; 
    int ram; 
    int screenSize;
    String resolution;
    int batteryCapacity; 
    String connectivity; 
    boolean isTouchScreen;
    boolean hasCamera;
    int cameraResolution; 
    boolean hasGPS;
    boolean hasBluetooth;
    String color;
    int price;
    boolean isOnSale;

    public Tab(int id, String name, String brand, String model, String operatingSystem, String processor, int storageCapacity, 
               int ram, int screenSize, String resolution, int batteryCapacity, String connectivity, boolean isTouchScreen, 
               boolean hasCamera, int cameraResolution, boolean hasGPS, boolean hasBluetooth, String color, int price, boolean isOnSale) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.storageCapacity = storageCapacity;
        this.ram = ram;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.batteryCapacity = batteryCapacity;
        this.connectivity = connectivity;
        this.isTouchScreen = isTouchScreen;
        this.hasCamera = hasCamera;
        this.cameraResolution = cameraResolution;
        this.hasGPS = hasGPS;
        this.hasBluetooth = hasBluetooth;
        this.color = color;
        this.price = price;
        this.isOnSale = isOnSale;
    }
}


