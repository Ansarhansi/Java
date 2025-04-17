package internal;

class RobotToy extends Toy {
    @Override
    public void describe() {
        System.out.println("This is a Robot Toy.");
    }
    public void move() {
        System.out.println("Robot Toy is moving.");
    }
}
