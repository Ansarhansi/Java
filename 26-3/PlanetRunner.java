 class PlanetRunner {
    public static void main(String[] args) {
        Planet p1 = new Planet(1, "Earth", 12742, 1, 5.972E24, "Oxygen-Nitrogen", true, true, 23.5, 365.25, 
                               149.6E6, 9.8, 78, 21, 1, "Rocky", "Blue-Green", true, "Solar System", "Milky Way");
        Planet p2 = new Planet(2, "Mars", 6779, 2, 6.417E23, "Carbon Dioxide", false, true, 25.0, 687, 
                               227.9E6, 3.71, 0, 95, 2, "Rocky", "Red", false, "Solar System", "Milky Way");
        Planet p3 = new Planet(3, "Jupiter", 139820, 79, 1.898E27, "Hydrogen-Helium", false, false, 3.13, 4333, 
                               778.5E6, 24.79, 0, 86, 79, "Gas Giant", "Orange-White", false, "Solar System", "Milky Way");

        System.out.println("Planet 1");
        System.out.println("ID: " + p1.id);
        System.out.println("Name: " + p1.name);
        System.out.println("Diameter: " + p1.diameter);
        System.out.println("Number of Moons: " + p1.numberOfMoons);
        System.out.println("Mass: " + p1.mass);
        System.out.println("Atmosphere Composition: " + p1.atmosphereComposition);
        System.out.println("Has Life: " + p1.hasLife);
        System.out.println("Has Water: " + p1.hasWater);
        System.out.println("Axial Tilt: " + p1.axialTilt);
        System.out.println("Orbital Period: " + p1.orbitalPeriod);
        System.out.println("Distance from Sun: " + p1.distanceFromSun);
        System.out.println("Gravity: " + p1.gravity);
        System.out.println("Nitrogen Percentage: " + p1.nitrogenPercentage);
        System.out.println("Oxygen Percentage: " + p1.oxygenPercentage);
        System.out.println("Number of Rings: " + p1.numberOfRings);
        System.out.println("Type: " + p1.type);
        System.out.println("Color: " + p1.color);
        System.out.println("Supports Habitation: " + p1.supportsHabitation);
        System.out.println("Star System: " + p1.starSystem);
        System.out.println("Galaxy: " + p1.galaxy);

        System.out.println(" ");
        System.out.println("Planet 2");
        System.out.println("ID: " + p2.id);
        System.out.println("Name: " + p2.name);
        System.out.println("Diameter: " + p2.diameter);
        System.out.println("Number of Moons: " + p2.numberOfMoons);
        System.out.println("Mass: " + p2.mass);
        System.out.println("Atmosphere Composition: " + p2.atmosphereComposition);
        System.out.println("Has Life: " + p2.hasLife);
        System.out.println("Has Water: " + p2.hasWater);
        System.out.println("Axial Tilt: " + p2.axialTilt);
        System.out.println("Orbital Period: " + p2.orbitalPeriod);
        System.out.println("Distance from Sun: " + p2.distanceFromSun);
        System.out.println("Gravity: " + p2.gravity);
        System.out.println("Nitrogen Percentage: " + p2.nitrogenPercentage);
        System.out.println("Oxygen Percentage: " + p2.oxygenPercentage);
        System.out.println("Number of Rings: " + p2.numberOfRings);
        System.out.println("Type: " + p2.type);
        System.out.println("Color: " + p2.color);
        System.out.println("Supports Habitation: " + p2.supportsHabitation);
        System.out.println("Star System: " + p2.starSystem);
        System.out.println("Galaxy: " + p2.galaxy);

        System.out.println(" ");
        System.out.println("Planet 3");
        System.out.println("ID: " + p3.id);
        System.out.println("Name: " + p3.name);
        System.out.println("Diameter: " + p3.diameter);
        System.out.println("Number of Moons: " + p3.numberOfMoons);
        System.out.println("Mass: " + p3.mass);
        System.out.println("Atmosphere Composition: " + p3.atmosphereComposition);
        System.out.println("Has Life: " + p3.hasLife);
        System.out.println("Has Water: " + p3.hasWater);
        System.out.println("Axial Tilt: " + p3.axialTilt);
        System.out.println("Orbital Period: " + p3.orbitalPeriod);
        System.out.println("Distance from Sun: " + p3.distanceFromSun);
        System.out.println("Gravity: " + p3.gravity);
        System.out.println("Nitrogen Percentage: " + p3.nitrogenPercentage);
        System.out.println("Oxygen Percentage: " + p3.oxygenPercentage);
        System.out.println("Number of Rings: " + p3.numberOfRings);
        System.out.println("Type: " + p3.type);
        System.out.println("Color: " + p3.color);
        System.out.println("Supports Habitation: " + p3.supportsHabitation);
        System.out.println("Star System: " + p3.starSystem);
        System.out.println("Galaxy: " + p3.galaxy);
    }
}
