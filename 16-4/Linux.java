package internal;

class Linux extends OperatingSystem {
    @Override
    public void describe() {
        System.out.println("This is Linux, an open-source OS.");
    }
    public void runShell() {
        System.out.println("Running shell commands.");
    }
}
