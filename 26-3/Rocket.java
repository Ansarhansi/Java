class Rocket {
    int id;
    String name;
    String manufacturer;
    String model;
    String fuelType;
    int payloadCapacity;
    int speed;
    int numberOfStages;
    boolean reusable;
    boolean hasRecoverySystem;
    String engineType;
    String condition;
    int numberOfEngines;
    int crewCapacity;
    boolean hasSafetySystems;
    int launchCost;
    String missionType;
    int launchPadNumber;
    String color;
    String primaryUsage;
    boolean operational;

    public Rocket(int id, String name, String manufacturer, String model, String fuelType, int payloadCapacity, int speed, 
                  int numberOfStages, boolean reusable, boolean hasRecoverySystem, String engineType, String condition, 
                  int numberOfEngines, int crewCapacity, boolean hasSafetySystems, int launchCost, String missionType, 
                  int launchPadNumber, String color, String primaryUsage, boolean operational) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.fuelType = fuelType;
        this.payloadCapacity = payloadCapacity;
        this.speed = speed;
        this.numberOfStages = numberOfStages;
        this.reusable = reusable;
        this.hasRecoverySystem = hasRecoverySystem;
        this.engineType = engineType;
        this.condition = condition;
        this.numberOfEngines = numberOfEngines;
        this.crewCapacity = crewCapacity;
        this.hasSafetySystems = hasSafetySystems;
        this.launchCost = launchCost;
        this.missionType = missionType;
        this.launchPadNumber = launchPadNumber;
        this.color = color;
        this.primaryUsage = primaryUsage;
        this.operational = operational;
    }
}