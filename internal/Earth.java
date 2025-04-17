package internal;

class Earth extends Planet {
    @Override
    public void describe() {
        System.out.println("This is Earth, the blue planet.");
    }
    public void rotate() {
        System.out.println("Earth is rotating.");
    }
}
