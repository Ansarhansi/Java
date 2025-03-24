public class HealthMetrics {
    public double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public double calculateBMI(int weight, int height) {
        return calculateBMI((double) weight, (double) height / 100);
    }
}
