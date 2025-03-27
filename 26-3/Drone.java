class Drone {
    int id;
    String name;
    String brand;
    String model;
    String type;
    int flightTime;
    double maxSpeed;
    boolean isWaterproof;
    String powerType;
    String cameraQuality;
    int range;
    boolean hasObstacleAvoidance;
    String navigationType;
    double chargingTime;
    int batteryCapacity;
    String material;
    String controlType;
    String color;
    String primaryPurpose;
    boolean isOperational;

    public Drone(int id, String name, String brand, String model, String type, int flightTime, double maxSpeed, 
                 boolean isWaterproof, String powerType, String cameraQuality, int range, boolean hasObstacleAvoidance, 
                 String navigationType, double chargingTime, int batteryCapacity, String material, String controlType, 
                 String color, String primaryPurpose, boolean isOperational) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.flightTime = flightTime;
        this.maxSpeed = maxSpeed;
        this.isWaterproof = isWaterproof;
        this.powerType = powerType;
        this.cameraQuality = cameraQuality;
        this.range = range;
        this.hasObstacleAvoidance = hasObstacleAvoidance;
        this.navigationType = navigationType;
        this.chargingTime = chargingTime;
        this.batteryCapacity = batteryCapacity;
        this.material = material;
        this.controlType = controlType;
        this.color = color;
        this.primaryPurpose = primaryPurpose;
        this.isOperational = isOperational;
    }
}