class Street extends Road {
    @Override
    void build() {
        System.out.println("Constructing a street.");
    }

    @Override
    void repair() {
        System.out.println("Fixing potholes on the street.");
    }

    @Override
    void close() {
        System.out.println("Closing the street for maintenance.");
    }

    @Override
    void open() {
        System.out.println("Opening the street for public.");
    }

    @Override
    void maintain() {
        System.out.println("Sweeping and cleaning the street.");
    }
}