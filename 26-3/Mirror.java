class Mirror {
    int length;          
    int width;            
    String material;       
    String brand;          
    String shape;          
    String color;          
    int usage;           
    boolean warranty;      
    int thickness;          
    int price;              
    String frameType;       
    String surfaceFinish;   
    int reflectiveIndex;    
    int durability;         
    int transparencyLevel;  
    int weight;             
    boolean isAntiGlare;    
    boolean isShatterproof; 

    public Mirror(int length, int width, String material, String brand, String shape, String color, int usage, boolean warranty, 
                  int thickness, int price, String frameType, String surfaceFinish, int reflectiveIndex, int durability, 
                  int transparencyLevel, int weight, boolean isAntiGlare, boolean isShatterproof) {
        this.length = length;
        this.width = width;
        this.material = material;
        this.brand = brand;
        this.shape = shape;
        this.color = color;
        this.usage = usage;
        this.warranty = warranty;
        this.thickness = thickness;
        this.price = price;
        this.frameType = frameType;
        this.surfaceFinish = surfaceFinish;
        this.reflectiveIndex = reflectiveIndex;
        this.durability = durability;
        this.transparencyLevel = transparencyLevel;
        this.weight = weight;
        this.isAntiGlare = isAntiGlare;
        this.isShatterproof = isShatterproof;
    }
}