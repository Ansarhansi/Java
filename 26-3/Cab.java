class Cab {
    int id;
    String name;
    String brand;
    String model;
    String engineType;
    String motorType;
    int seatingCapacity;
    String color;
    int price;
    boolean isAvailable;
    String transmissionType;
    double mileage;
    String acType;
    boolean hasAirbags;
    boolean hasMusicSystem;
    int bootSpace;
    int numberOfDoors;
    boolean hasGPS;
    String seatMaterial;
    String roofFeature;

    public Cab(int id, String name, String brand, String model, String engineType, String motorType, int seatingCapacity, 
               String color, int price, boolean isAvailable, String transmissionType, double mileage, String acType, 
               boolean hasAirbags, boolean hasMusicSystem, int bootSpace, int numberOfDoors, boolean hasGPS, 
               String seatMaterial, String roofFeature) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.motorType = motorType;
        this.seatingCapacity = seatingCapacity;
        this.color = color;
        this.price = price;
        this.isAvailable = isAvailable;
        this.transmissionType = transmissionType;
        this.mileage = mileage;
        this.acType = acType;
        this.hasAirbags = hasAirbags;
        this.hasMusicSystem = hasMusicSystem;
        this.bootSpace = bootSpace;
        this.numberOfDoors = numberOfDoors;
        this.hasGPS = hasGPS;
        this.seatMaterial = seatMaterial;
        this.roofFeature = roofFeature;
    }
}