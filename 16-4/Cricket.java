package internal;

class Cricket extends Game {
    @Override
    public void start() {
        System.out.println("Cricket match started.");
    }

    public void score() {
        System.out.println("Updating cricket score.");
    }
}