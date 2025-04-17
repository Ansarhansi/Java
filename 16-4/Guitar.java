package internal;

class Guitar extends Instrument {
    @Override
    public void describe() {
        System.out.println("This is a Guitar, a string instrument.");
    }
    public void playChords() {
        System.out.println("Guitar is playing chords.");
    }
}
