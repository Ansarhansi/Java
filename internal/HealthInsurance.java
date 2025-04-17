package internal;

class HealthInsurance extends Insurance {
    @Override
    public void insure() {
        System.out.println("Providing health insurance.");
    }

    public void claim() {
        System.out.println("Claiming health insurance.");
    }
}

