package internal;

class AWS extends CloudService {
    @Override
    public void describe() {
        System.out.println("This is AWS, a cloud platform.");
    }
    public void deploy() {
        System.out.println("Deploying on AWS.");
    }
}
