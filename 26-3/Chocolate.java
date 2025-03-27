class Chocolate {
    int id;
    String name;
    String brand;
    String type;
    String shape;
    int weight;
    String color;
    boolean hasNuts;
    String flavor;
    int calories;
    int sugarPercentage;
    boolean isVegan;
    boolean glutenFree;
    int numberOfPieces;
    int cocoaPercentage;
    boolean fairTradeCertified;
    String packagingEcoFriendly;
    String packagingFinish;
    String packagingMaterial;
    boolean limitedEdition;

    public Chocolate(int id, String name, String brand, String type, String shape, int weight, String color, 
                     boolean hasNuts, String flavor, int calories, int sugarPercentage, boolean isVegan, boolean glutenFree, 
                     int numberOfPieces, int cocoaPercentage, boolean fairTradeCertified, String packagingEcoFriendly, 
                     String packagingFinish, String packagingMaterial, boolean limitedEdition) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.shape = shape;
        this.weight = weight;
        this.color = color;
        this.hasNuts = hasNuts;
        this.flavor = flavor;
        this.calories = calories;
        this.sugarPercentage = sugarPercentage;
        this.isVegan = isVegan;
        this.glutenFree = glutenFree;
        this.numberOfPieces = numberOfPieces;
        this.cocoaPercentage = cocoaPercentage;
        this.fairTradeCertified = fairTradeCertified;
        this.packagingEcoFriendly = packagingEcoFriendly;
        this.packagingFinish = packagingFinish;
        this.packagingMaterial = packagingMaterial;
        this.limitedEdition = limitedEdition;
    }
}