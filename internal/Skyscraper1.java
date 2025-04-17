package internal;

class Skyscraper1 extends BuildingStructure {
    @Override
    public void construct() {
        System.out.println("Skyscraper is being constructed with steel and glass.");
    }
    public void installElevators() {
        System.out.println("Skyscraper elevators are being installed.");
    }
}