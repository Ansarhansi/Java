class Duster {
    int id;
    String name;
    String brand;
    String model;
    String material;
    int length;
    String color;
    double price;
    boolean reusable;
    String handleType;
    String headShape;
    boolean machineWashable;
    String usage;
    int durability;
    boolean ecoFriendly;
    int weight;
    String handleMaterial;
    String dustAttraction;
    int numberOfHeads;
    boolean compactDesign;

    public Duster(int id, String name, String brand, String model, String material, int length, String color, double price, 
                  boolean reusable, String handleType, String headShape, boolean machineWashable, String usage, int durability, 
                  boolean ecoFriendly, int weight, String handleMaterial, String dustAttraction, int numberOfHeads, boolean compactDesign) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.material = material;
        this.length = length;
        this.color = color;
        this.price = price;
        this.reusable = reusable;
        this.handleType = handleType;
        this.headShape = headShape;
        this.machineWashable = machineWashable;
        this.usage = usage;
        this.durability = durability;
        this.ecoFriendly = ecoFriendly;
        this.weight = weight;
        this.handleMaterial = handleMaterial;
        this.dustAttraction = dustAttraction;
        this.numberOfHeads = numberOfHeads;
        this.compactDesign = compactDesign;
    }
}