package internal;

class Train extends Transport {
    @Override
    public void describe() {
        System.out.println("This is a Train for long-distance travel.");
    }
    public void whistle() {
        System.out.println("Train is whistling.");
    }
}