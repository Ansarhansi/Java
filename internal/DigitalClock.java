package internal;

class DigitalClock extends Clock {
    @Override
    public void tick() {
        System.out.println("Digital clock updating time.");
    }

    public void setAlarm() {
        System.out.println("Setting alarm on digital clock.");
    }
}