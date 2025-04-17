package internal;

class PremiumMembership extends Membership {
    @Override
    public void describe() {
        System.out.println("This is a Premium Membership.");
    }
    public void accessExclusiveContent() {
        System.out.println("Accessing exclusive premium content.");
    }
}

