package internal;

class Sculpture extends ArtPiece {
    @Override
    public void display() {
        System.out.println("Sculpture is being displayed in a gallery.");
    }
    public void polish() {
        System.out.println("Sculpture is being polished.");
    }
}
