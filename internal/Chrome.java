package internal;

class Chrome extends Browser {
    @Override
    public void describe() {
        System.out.println("This is Chrome browser.");
    }
    public void openTab() {
        System.out.println("Opening a new Chrome tab.");
    }
}