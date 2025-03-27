class Satellite {
    int id;
    String name;
    String organization;
    String orbitType;
    String function;
    int launchYear;
    int weight;
    double speed;
    boolean isPowered;
    String energySource;
    int operationalLife;
    boolean communicatesWithGround;
    String primaryPurpose;
    boolean isOperational;
    String material;
    String color;
    int altitude;
    String missionType;
    boolean hasBackupSystems;
    int numberOfAntennas;

    public Satellite(int id, String name, String organization, String orbitType, String function, int launchYear, int weight, 
                     double speed, boolean isPowered, String energySource, int operationalLife, boolean communicatesWithGround, 
                     String primaryPurpose, boolean isOperational, String material, String color, int altitude, 
                     String missionType, boolean hasBackupSystems, int numberOfAntennas) {
        this.id = id;
        this.name = name;
        this.organization = organization;
        this.orbitType = orbitType;
        this.function = function;
        this.launchYear = launchYear;
        this.weight = weight;
        this.speed = speed;
        this.isPowered = isPowered;
        this.energySource = energySource;
        this.operationalLife = operationalLife;
        this.communicatesWithGround = communicatesWithGround;
        this.primaryPurpose = primaryPurpose;
        this.isOperational = isOperational;
        this.material = material;
        this.color = color;
        this.altitude = altitude;
        this.missionType = missionType;
        this.hasBackupSystems = hasBackupSystems;
        this.numberOfAntennas = numberOfAntennas;
    }
}