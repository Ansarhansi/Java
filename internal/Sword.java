package internal;

class Sword extends Weapon {
    @Override
    public void describe() {
        System.out.println("This is a Sword for combat.");
    }
    public void slash() {
        System.out.println("Sword is slashing.");
    }
}
