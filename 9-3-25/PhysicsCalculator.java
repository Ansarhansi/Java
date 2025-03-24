public class PhysicsCalculator {
    public double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    public double calculateWork(double force, double distance) {
        return force * distance;
    }
}
