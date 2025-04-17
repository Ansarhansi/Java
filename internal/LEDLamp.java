package internal;

class LEDLamp extends Lamp {
    @Override
    public void glow() {
        System.out.println("LED Lamp glowing brightly.");
    }

    public void saveEnergy() {
        System.out.println("LED saves energy.");
    }
}
