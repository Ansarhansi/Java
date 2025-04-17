package internal;

class ItalianRestaurant extends Restaurant {
    @Override
    public void serveFood() {
        System.out.println("Serving Italian pasta.");
    }

    public void playMusic() {
        System.out.println("Playing Italian music.");
    }
}