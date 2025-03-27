class Dustbin {
    int id;
    String name;
    String brand;
    String shape;
    int capacity;
    String color;
    String material;
    double price;
    boolean hasLid;
    boolean isPedalOperated;
    boolean isSensorOperated;
    String usageType;
    String openingMechanism;
    boolean hasWheels;
    int durability;
    String recyclability;
    String ecoFriendly;
    String odorControl;
    String design;
    boolean isWaterproof;

    public Dustbin(int id, String name, String brand, String shape, int capacity, String color, String material, double price, 
                   boolean hasLid, boolean isPedalOperated, boolean isSensorOperated, String usageType, String openingMechanism, 
                   boolean hasWheels, int durability, String recyclability, String ecoFriendly, String odorControl, String design, 
                   boolean isWaterproof) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.shape = shape;
        this.capacity = capacity;
        this.color = color;
        this.material = material;
        this.price = price;
        this.hasLid = hasLid;
        this.isPedalOperated = isPedalOperated;
        this.isSensorOperated = isSensorOperated;
        this.usageType = usageType;
        this.openingMechanism = openingMechanism;
        this.hasWheels = hasWheels;
        this.durability = durability;
        this.recyclability = recyclability;
        this.ecoFriendly = ecoFriendly;
        this.odorControl = odorControl;
        this.design = design;
        this.isWaterproof = isWaterproof;
    }
}