package internal;

class ElectricGuitar extends MusicalInstrument {
    @Override
    public void playSound() {
        System.out.println("Electric Guitar is playing a rock sound.");
    }
    public void tune() {
        System.out.println("Electric Guitar is being tuned.");
    }
}