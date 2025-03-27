class DustbinRunner {
    public static void main(String[] args) {
        Dustbin db1 = new Dustbin(401, "EcoBin", "BrandA", "Round", 30, "Green", "Plastic", 499.99, true, true, true, 
                                  "Outdoor", "Pedal Operated", false, 5, "Recyclable", "Eco-Friendly", "Anti-Odor", 
                                  "Compact", true);
        Dustbin db2 = new Dustbin(402, "SmartBin", "BrandB", "Square", 50, "Gray", "Stainless Steel", 1299.99, false, true, 
                                  true, "Indoor", "Sensor Operated", true, 3, "Non-Recyclable", "Not Eco-Friendly", 
                                  "No Odor Control", "Bulky", false);
        Dustbin db3 = new Dustbin(403, "BasicBin", "BrandC", "Rectangular", 20, "Blue", "Plastic", 299.99, false, false, 
                                  false, "Indoor", "Manual Lid", false, 7, "Recyclable", "Eco-Friendly", "Anti-Odor", 
                                  "Compact", true);

        System.out.println("Dustbin 1");
        System.out.println("ID: " + db1.id);
        System.out.println("Name: " + db1.name);
        System.out.println("Brand: " + db1.brand);
        System.out.println("Shape: " + db1.shape);
        System.out.println("Capacity: " + db1.capacity);
        System.out.println("Color: " + db1.color);
        System.out.println("Material: " + db1.material);
        System.out.println("Price: " + db1.price);
        System.out.println("Has Lid: " + db1.hasLid);
        System.out.println("Is Pedal Operated: " + db1.isPedalOperated);
        System.out.println("Is Sensor Operated: " + db1.isSensorOperated);
        System.out.println("Usage Type: " + db1.usageType);
        System.out.println("Opening Mechanism: " + db1.openingMechanism);
        System.out.println("Has Wheels: " + db1.hasWheels);
        System.out.println("Durability: " + db1.durability);
        System.out.println("Recyclability: " + db1.recyclability);
        System.out.println("Eco-Friendly: " + db1.ecoFriendly);
        System.out.println("Odor Control: " + db1.odorControl);
        System.out.println("Design: " + db1.design);
        System.out.println("Waterproof: " + db1.isWaterproof);

        System.out.println(" ");
        System.out.println("Dustbin 2");
        System.out.println("ID: " + db2.id);
        System.out.println("Name: " + db2.name);
        System.out.println("Brand: " + db2.brand);
        System.out.println("Shape: " + db2.shape);
        System.out.println("Capacity: " + db2.capacity);
        System.out.println("Color: " + db2.color);
        System.out.println("Material: " + db2.material);
        System.out.println("Price: " + db2.price);
        System.out.println("Has Lid: " + db2.hasLid);
        System.out.println("Is Pedal Operated: " + db2.isPedalOperated);
        System.out.println("Is Sensor Operated: " + db2.isSensorOperated);
        System.out.println("Usage Type: " + db2.usageType);
        System.out.println("Opening Mechanism: " + db2.openingMechanism);
        System.out.println("Has Wheels: " + db2.hasWheels);
        System.out.println("Durability: " + db2.durability);
        System.out.println("Recyclability: " + db2.recyclability);
        System.out.println("Eco-Friendly: " + db2.ecoFriendly);
        System.out.println("Odor Control: " + db2.odorControl);
        System.out.println("Design: " + db2.design);
        System.out.println("Waterproof: " + db2.isWaterproof);

        System.out.println(" ");
        System.out.println("Dustbin 3");
        System.out.println("ID: " + db3.id);
        System.out.println("Name: " + db3.name);
        System.out.println("Brand: " + db3.brand);
        System.out.println("Shape: " + db3.shape);
        System.out.println("Capacity: " + db3.capacity);
        System.out.println("Color: " + db3.color);
        System.out.println("Material: " + db3.material);
        System.out.println("Price: " + db3.price);
        System.out.println("Has Lid: " + db3.hasLid);
        System.out.println("Is Pedal Operated: " + db3.isPedalOperated);
        System.out.println("Is Sensor Operated: " + db3.isSensorOperated);
        System.out.println("Usage Type: " + db3.usageType);
        System.out.println("Opening Mechanism: " + db3.openingMechanism);
        System.out.println("Has Wheels: " + db3.hasWheels);
        System.out.println("Durability: " + db3.durability);
        System.out.println("Recyclability: " + db3.recyclability);
        System.out.println("Eco-Friendly: " + db3.ecoFriendly);
        System.out.println("Odor Control: " + db3.odorControl);
        System.out.println("Design: " + db3.design);
        System.out.println("Waterproof: " + db3.isWaterproof);
    }
}

