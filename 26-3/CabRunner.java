class CabRunner {
    public static void main(String[] args) {
        Cab c1 = new Cab(201, "CabA", "BrandX", "ModelX", "Electric", "Single Motor", 4, "Black", 2500000, true, "Automatic", 
                         5.5, "AC", true, true, 350, 2, true, "Leather", "Sunroof");
        Cab c2 = new Cab(202, "CabB", "BrandY", "ModelY", "Hybrid", "Dual Motor", 5, "White", 1500000, false, "Manual", 
                         6.0, "Non-AC", false, true, 300, 1, false, "Fabric", "No Sunroof");
        Cab c3 = new Cab(203, "CabC", "BrandZ", "ModelZ", "Diesel", "Quad Motor", 7, "Gray", 1000000, true, "Automatic", 
                         4.8, "AC", true, false, 400, 3, true, "Velvet", "Sunroof");

        System.out.println("Cab 1");
        System.out.println("ID: " + c1.id);
        System.out.println("Name: " + c1.name);
        System.out.println("Brand: " + c1.brand);
        System.out.println("Model: " + c1.model);
        System.out.println("Engine Type: " + c1.engineType);
        System.out.println("Motor Type: " + c1.motorType);
        System.out.println("Seating Capacity: " + c1.seatingCapacity);
        System.out.println("Color: " + c1.color);
        System.out.println("Price: " + c1.price);
        System.out.println("Available: " + c1.isAvailable);
        System.out.println("Transmission Type: " + c1.transmissionType);
        System.out.println("Mileage: " + c1.mileage);
        System.out.println("AC Type: " + c1.acType);
        System.out.println("Has Airbags: " + c1.hasAirbags);
        System.out.println("Has Music System: " + c1.hasMusicSystem);
        System.out.println("Boot Space: " + c1.bootSpace);
        System.out.println("Number of Doors: " + c1.numberOfDoors);
        System.out.println("Has GPS: " + c1.hasGPS);
        System.out.println("Seat Material: " + c1.seatMaterial);
        System.out.println("Roof Feature: " + c1.roofFeature);

        System.out.println(" ");
        System.out.println("Cab 2");
        System.out.println("ID: " + c2.id);
        System.out.println("Name: " + c2.name);
        System.out.println("Brand: " + c2.brand);
        System.out.println("Model: " + c2.model);
        System.out.println("Engine Type: " + c2.engineType);
        System.out.println("Motor Type: " + c2.motorType);
        System.out.println("Seating Capacity: " + c2.seatingCapacity);
        System.out.println("Color: " + c2.color);
        System.out.println("Price: " + c2.price);
        System.out.println("Available: " + c2.isAvailable);
        System.out.println("Transmission Type: " + c2.transmissionType);
        System.out.println("Mileage: " + c2.mileage);
        System.out.println("AC Type: " + c2.acType);
        System.out.println("Has Airbags: " + c2.hasAirbags);
        System.out.println("Has Music System: " + c2.hasMusicSystem);
        System.out.println("Boot Space: " + c2.bootSpace);
        System.out.println("Number of Doors: " + c2.numberOfDoors);
        System.out.println("Has GPS: " + c2.hasGPS);
        System.out.println("Seat Material: " + c2.seatMaterial);
        System.out.println("Roof Feature: " + c2.roofFeature);

        System.out.println(" ");
        System.out.println("Cab 3");
        System.out.println("ID: " + c3.id);
        System.out.println("Name: " + c3.name);
        System.out.println("Brand: " + c3.brand);
        System.out.println("Model: " + c3.model);
        System.out.println("Engine Type: " + c3.engineType);
        System.out.println("Motor Type: " + c3.motorType);
        System.out.println("Seating Capacity: " + c3.seatingCapacity);
        System.out.println("Color: " + c3.color);
        System.out.println("Price: " + c3.price);
        System.out.println("Available: " + c3.isAvailable);
        System.out.println("Transmission Type: " + c3.transmissionType);
        System.out.println("Mileage: " + c3.mileage);
        System.out.println("AC Type: " + c3.acType);
        System.out.println("Has Airbags: " + c3.hasAirbags);
        System.out.println("Has Music System: " + c3.hasMusicSystem);
        System.out.println("Boot Space: " + c3.bootSpace);
        System.out.println("Number of Doors: " + c3.numberOfDoors);
        System.out.println("Has GPS: " + c3.hasGPS);
        System.out.println("Seat Material: " + c3.seatMaterial);
        System.out.println("Roof Feature: " + c3.roofFeature);
    }
}