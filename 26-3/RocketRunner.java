class RocketRunner {
    public static void main(String[] args) {
        Rocket r1 = new Rocket(301, "Falcon 9", "SpaceX", "FT", "RP-1/LOX", 22000, 600, 2, true, true, "Merlin Engines", 
                               "Reused", 9, 1, true, 55000000, "Low Earth Orbit", 4, "White", "GPS Satellites", true);
        Rocket r2 = new Rocket(302, "SLS", "NASA", "Block 1", "LH2/LOX", 95000, 1100, 3, false, false, "RS-25 Engines", 
                               "New", 4, 2, false, 2000000000, "Moon Mission", 4, "Orange", "Orion Crew", true);
        Rocket r3 = new Rocket(303, "Ariane 5", "ESA", "ECA", "Hydrazine", 21000, 1100, 1, false, false, "Vulcain Engines", 
                               "New", 2, 1, true, 180000000, "Geostationary Transfer Orbit", 2, "Black", "Telecom Satellites", true);

        System.out.println("Rocket 1");
        System.out.println("ID: " + r1.id);
        System.out.println("Name: " + r1.name);
        System.out.println("Manufacturer: " + r1.manufacturer);
        System.out.println("Model: " + r1.model);
        System.out.println("Fuel Type: " + r1.fuelType);
        System.out.println("Payload Capacity: " + r1.payloadCapacity);
        System.out.println("Speed: " + r1.speed);
        System.out.println("Number of Stages: " + r1.numberOfStages);
        System.out.println("Reusable: " + r1.reusable);
        System.out.println("Has Recovery System: " + r1.hasRecoverySystem);
        System.out.println("Engine Type: " + r1.engineType);
        System.out.println("Condition: " + r1.condition);
        System.out.println("Number of Engines: " + r1.numberOfEngines);
        System.out.println("Crew Capacity: " + r1.crewCapacity);
        System.out.println("Has Safety Systems: " + r1.hasSafetySystems);
        System.out.println("Launch Cost: " + r1.launchCost);
        System.out.println("Mission Type: " + r1.missionType);
        System.out.println("Launch Pad Number: " + r1.launchPadNumber);
        System.out.println("Color: " + r1.color);
        System.out.println("Primary Usage: " + r1.primaryUsage);
        System.out.println("Operational: " + r1.operational);

        System.out.println(" ");
        System.out.println("Rocket 2");
        System.out.println("ID: " + r2.id);
        System.out.println("Name: " + r2.name);
        System.out.println("Manufacturer: " + r2.manufacturer);
        System.out.println("Model: " + r2.model);
        System.out.println("Fuel Type: " + r2.fuelType);
        System.out.println("Payload Capacity: " + r2.payloadCapacity);
        System.out.println("Speed: " + r2.speed);
        System.out.println("Number of Stages: " + r2.numberOfStages);
        System.out.println("Reusable: " + r2.reusable);
        System.out.println("Has Recovery System: " + r2.hasRecoverySystem);
        System.out.println("Engine Type: " + r2.engineType);
        System.out.println("Condition: " + r2.condition);
        System.out.println("Number of Engines: " + r2.numberOfEngines);
        System.out.println("Crew Capacity: " + r2.crewCapacity);
        System.out.println("Has Safety Systems: " + r2.hasSafetySystems);
        System.out.println("Launch Cost: " + r2.launchCost);
        System.out.println("Mission Type: " + r2.missionType);
        System.out.println("Launch Pad Number: " + r2.launchPadNumber);
        System.out.println("Color: " + r2.color);
        System.out.println("Primary Usage: " + r2.primaryUsage);
        System.out.println("Operational: " + r2.operational);

        System.out.println(" ");
        System.out.println("Rocket 3");
        System.out.println("ID: " + r3.id);
        System.out.println("Name: " + r3.name);
        System.out.println("Manufacturer: " + r3.manufacturer);
        System.out.println("Model: " + r3.model);
        System.out.println("Fuel Type: " + r3.fuelType);
        System.out.println("Payload Capacity: " + r3.payloadCapacity);
        System.out.println("Speed: " + r3.speed);
        System.out.println("Number of Stages: " + r3.numberOfStages);
        System.out.println("Reusable: " + r3.reusable);
        System.out.println("Has Recovery System: " + r3.hasRecoverySystem);
        System.out.println("Engine Type: " + r3.engineType);
        System.out.println("Condition: " + r3.condition);
        System.out.println("Number of Engines: " + r3.numberOfEngines);
        System.out.println("Crew Capacity: " + r3.crewCapacity);
        System.out.println("Has Safety Systems: " + r3.hasSafetySystems);
        System.out.println("Launch Cost: " + r3.launchCost);
        System.out.println("Mission Type: " + r3.missionType);
        System.out.println("Launch Pad Number: " + r3.launchPadNumber);
        System.out.println("Color: " + r3.color);
        System.out.println("Primary Usage: " + r3.primaryUsage);
        System.out.println("Operational: " + r3.operational);
    }
}

