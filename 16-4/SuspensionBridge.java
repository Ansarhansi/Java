package internal;

class SuspensionBridge extends Bridge {
    @Override
    public void construct() {
        System.out.println("Constructing a suspension bridge.");
    }

    public void supportCables() {
        System.out.println("Tensioning support cables.");
    }
}
