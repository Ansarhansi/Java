class Highway extends Road {
    @Override
    void build() {
        System.out.println("Building a highway.");
    }

    @Override
    void repair() {
        System.out.println("Repairing the highway.");
    }

    @Override
    void close() {
        System.out.println("Closing the highway temporarily.");
    }

    @Override
    void open() {
        System.out.println("Opening the highway for traffic.");
    }

    @Override
    void maintain() {
        System.out.println("Maintaining the highway.");
    }
}