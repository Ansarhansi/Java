package internal;

class RoseGarden extends Garden {
    @Override
    public void maintain() {
        System.out.println("Watering the roses.");
    }

    public void plantRoses() {
        System.out.println("Planting rose saplings.");
    }
}
