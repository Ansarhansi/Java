package internal;

class Suitcase extends TravelItem {
    @Override
    public void useForTravel() {
        System.out.println("Suitcase is being used for packing clothes for travel.");
    }
    public void packItems() {
        System.out.println("Suitcase is being packed with items.");
    }
}