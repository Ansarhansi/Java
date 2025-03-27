class Planet {
    int id;
    String name;
    int diameter;
    int numberOfMoons;
    double mass;
    String atmosphereComposition;
    boolean hasLife;
    boolean hasWater;
    double axialTilt;
    double orbitalPeriod;
    double distanceFromSun;
    double gravity;
    int nitrogenPercentage;
    int oxygenPercentage;
    int numberOfRings;
    String type;
    String color;
    boolean supportsHabitation;
    String starSystem;
    String galaxy;

    public Planet(int id, String name, int diameter, int numberOfMoons, double mass, String atmosphereComposition, 
                  boolean hasLife, boolean hasWater, double axialTilt, double orbitalPeriod, double distanceFromSun, 
                  double gravity, int nitrogenPercentage, int oxygenPercentage, int numberOfRings, String type, 
                  String color, boolean supportsHabitation, String starSystem, String galaxy) {
        this.id = id;
        this.name = name;
        this.diameter = diameter;
        this.numberOfMoons = numberOfMoons;
        this.mass = mass;
        this.atmosphereComposition = atmosphereComposition;
        this.hasLife = hasLife;
        this.hasWater = hasWater;
        this.axialTilt = axialTilt;
        this.orbitalPeriod = orbitalPeriod;
        this.distanceFromSun = distanceFromSun;
        this.gravity = gravity;
        this.nitrogenPercentage = nitrogenPercentage;
        this.oxygenPercentage = oxygenPercentage;
        this.numberOfRings = numberOfRings;
        this.type = type;
        this.color = color;
        this.supportsHabitation = supportsHabitation;
        this.starSystem = starSystem;
        this.galaxy = galaxy;
    }
}