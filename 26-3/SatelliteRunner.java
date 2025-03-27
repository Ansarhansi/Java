class SatelliteRunner {
    public static void main(String[] args) {
        Satellite s1 = new Satellite(601, "Hubble", "NASA", "Low Earth Orbit", "Optical Telescope", 1990, 13200, 
                                     27.3, true, "Solar Panels", 25, true, "Scientific Research", true, "Aluminum Alloy", 
                                     "Blue", 8000, "Galaxy Exploration", true, 2);
        Satellite s2 = new Satellite(602, "GPS IIF", "USAF", "Medium Earth Orbit", "Navigation", 2014, 1540, 4.8, false, 
                                     "Battery Powered", 15, true, "Positioning System", false, "Titanium", "Silver", 
                                     20000, "Navigation Services", false, 0);
        Satellite s3 = new Satellite(603, "James Webb", "NASA", "Halo Orbit", "Infrared Telescope", 2021, 6500, 0.0, 
                                     true, "Solar Panels", 50, true, "Astronomical Observations", true, 
                                     "Beryllium", "Gold", 100000, "Space Exploration", true, 3);

        System.out.println("Satellite 1");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Organization: " + s1.organization);
        System.out.println("Orbit Type: " + s1.orbitType);
        System.out.println("Function: " + s1.function);
        System.out.println("Launch Year: " + s1.launchYear);
        System.out.println("Weight: " + s1.weight);
        System.out.println("Speed: " + s1.speed);
        System.out.println("Powered: " + s1.isPowered);
        System.out.println("Energy Source: " + s1.energySource);
        System.out.println("Operational Life: " + s1.operationalLife);
        System.out.println("Communicates with Ground Station: " + s1.communicatesWithGround);
        System.out.println("Primary Purpose: " + s1.primaryPurpose);
        System.out.println("Is Operational: " + s1.isOperational);
        System.out.println("Material: " + s1.material);
        System.out.println("Color: " + s1.color);
        System.out.println("Altitude: " + s1.altitude);
        System.out.println("Mission Type: " + s1.missionType);
        System.out.println("Has Backup Systems: " + s1.hasBackupSystems);
        System.out.println("Number of Antennas: " + s1.numberOfAntennas);

        System.out.println(" ");
        System.out.println("Satellite 2");
        System.out.println("ID: " + s2.id);
        System.out.println("Name: " + s2.name);
        System.out.println("Organization: " + s2.organization);
        System.out.println("Orbit Type: " + s2.orbitType);
        System.out.println("Function: " + s2.function);
        System.out.println("Launch Year: " + s2.launchYear);
        System.out.println("Weight: " + s2.weight);
        System.out.println("Speed: " + s2.speed);
        System.out.println("Powered: " + s2.isPowered);
        System.out.println("Energy Source: " + s2.energySource);
        System.out.println("Operational Life: " + s2.operationalLife);
        System.out.println("Communicates with Ground Station: " + s2.communicatesWithGround);
        System.out.println("Primary Purpose: " + s2.primaryPurpose);
        System.out.println("Is Operational: " + s2.isOperational);
        System.out.println("Material: " + s2.material);
        System.out.println("Color: " + s2.color);
        System.out.println("Altitude: " + s2.altitude);
        System.out.println("Mission Type: " + s2.missionType);
        System.out.println("Has Backup Systems: " + s2.hasBackupSystems);
        System.out.println("Number of Antennas: " + s2.numberOfAntennas);

        System.out.println(" ");
        System.out.println("Satellite 3");
        System.out.println("ID: " + s3.id);
        System.out.println("Name: " + s3.name);
        System.out.println("Organization: " + s3.organization);
        System.out.println("Orbit Type: " + s3.orbitType);
        System.out.println("Function: " + s3.function);
        System.out.println("Launch Year: " + s3.launchYear);
        System.out.println("Weight: " + s3.weight);
        System.out.println("Speed: " + s3.speed);
        System.out.println("Powered: " + s3.isPowered);
        System.out.println("Energy Source: " + s3.energySource);
        System.out.println("Operational Life: " + s3.operationalLife);
        System.out.println("Communicates with Ground Station: " + s3.communicatesWithGround);
        System.out.println("Primary Purpose: " + s3.primaryPurpose);
        System.out.println("Is Operational: " + s3.isOperational);
        System.out.println("Material: " + s3.material);
        System.out.println("Color: " + s3.color);
        System.out.println("Altitude: " + s3.altitude);
        System.out.println("Mission Type: " + s3.missionType);
        System.out.println("Has Backup Systems: " + s3.hasBackupSystems);
        System.out.println("Number of Antennas: " + s3.numberOfAntennas);
    }
}

