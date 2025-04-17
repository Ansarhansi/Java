package internal;

class SpaceX extends Rocket {
    @Override
    public void launch() {
        System.out.println("SpaceX Falcon 9 launched.");
    }

    public void reuse() {
        System.out.println("Reusing rocket parts.");
    }
}