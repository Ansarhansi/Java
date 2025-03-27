class DroneRunner {
    public static void main(String[] args) {
        Drone d1 = new Drone(501, "SkyMaster", "BrandX", "ModelA", "Quadcopter", 30, 15.5, true, "Rechargeable", 
                             "HD Camera", 1200, true, "GPS Enabled", 2.5, 2000, "Carbon Fiber", "Automatic", "Black", 
                             "Photography", true);
        Drone d2 = new Drone(502, "FlyTech", "BrandY", "ModelB", "Hexacopter", 25, 10.0, false, "Battery Operated", 
                             "4K Camera", 800, false, "No GPS", 2.0, 1500, "Plastic", "Manual", "White", "Surveillance", false);
        Drone d3 = new Drone(503, "AeroPro", "BrandZ", "ModelC", "Octocopter", 40, 20.0, true, "Solar Powered", 
                             "8K Camera", 2500, true, "GPS Enabled", 3.0, 3000, "Aluminum Alloy", "Automatic", "Silver", 
                             "Delivery", true);

        System.out.println("Drone 1");
        System.out.println("ID: " + d1.id);
        System.out.println("Name: " + d1.name);
        System.out.println("Brand: " + d1.brand);
        System.out.println("Model: " + d1.model);
        System.out.println("Type: " + d1.type);
        System.out.println("Flight Time: " + d1.flightTime);
        System.out.println("Max Speed: " + d1.maxSpeed);
        System.out.println("Is Waterproof: " + d1.isWaterproof);
        System.out.println("Power Type: " + d1.powerType);
        System.out.println("Camera Quality: " + d1.cameraQuality);
        System.out.println("Range: " + d1.range);
        System.out.println("Has Obstacle Avoidance: " + d1.hasObstacleAvoidance);
        System.out.println("Navigation Type: " + d1.navigationType);
        System.out.println("Charging Time: " + d1.chargingTime);
        System.out.println("Battery Capacity: " + d1.batteryCapacity);
        System.out.println("Material: " + d1.material);
        System.out.println("Control Type: " + d1.controlType);
        System.out.println("Color: " + d1.color);
        System.out.println("Primary Purpose: " + d1.primaryPurpose);
        System.out.println("Operational: " + d1.isOperational);

        System.out.println(" ");
        System.out.println("Drone 2");
        System.out.println("ID: " + d2.id);
        System.out.println("Name: " + d2.name);
        System.out.println("Brand: " + d2.brand);
        System.out.println("Model: " + d2.model);
        System.out.println("Type: " + d2.type);
        System.out.println("Flight Time: " + d2.flightTime);
        System.out.println("Max Speed: " + d2.maxSpeed);
        System.out.println("Is Waterproof: " + d2.isWaterproof);
        System.out.println("Power Type: " + d2.powerType);
        System.out.println("Camera Quality: " + d2.cameraQuality);
        System.out.println("Range: " + d2.range);
        System.out.println("Has Obstacle Avoidance: " + d2.hasObstacleAvoidance);
        System.out.println("Navigation Type: " + d2.navigationType);
        System.out.println("Charging Time: " + d2.chargingTime);
        System.out.println("Battery Capacity: " + d2.batteryCapacity);
        System.out.println("Material: " + d2.material);
        System.out.println("Control Type: " + d2.controlType);
        System.out.println("Color: " + d2.color);
        System.out.println("Primary Purpose: " + d2.primaryPurpose);
        System.out.println("Operational: " + d2.isOperational);

        System.out.println(" ");
        System.out.println("Drone 3");
        System.out.println("ID: " + d3.id);
        System.out.println("Name: " + d3.name);
        System.out.println("Brand: " + d3.brand);
        System.out.println("Model: " + d3.model);
        System.out.println("Type: " + d3.type);
        System.out.println("Flight Time: " + d3.flightTime);
        System.out.println("Max Speed: " + d3.maxSpeed);
        System.out.println("Is Waterproof: " + d3.isWaterproof);
        System.out.println("Power Type: " + d3.powerType);
        System.out.println("Camera Quality: " + d3.cameraQuality);
        System.out.println("Range: " + d3.range);
        System.out.println("Has Obstacle Avoidance: " + d3.hasObstacleAvoidance);
        System.out.println("Navigation Type: " + d3.navigationType);
        System.out.println("Charging Time: " + d3.chargingTime);
        System.out.println("Battery Capacity: " + d3.batteryCapacity);
        System.out.println("Material: " + d3.material);
        System.out.println("Control Type: " + d3.controlType);
        System.out.println("Color: " + d3.color);
        System.out.println("Primary Purpose: " + d3.primaryPurpose);
        System.out.println("Operational: " + d3.isOperational);
    }
}

