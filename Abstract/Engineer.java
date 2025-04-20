class Engineer extends Job {
    @Override
    void work() {
        System.out.println("Designing and building projects.");
    }

    @Override
    void getSalary() {
        System.out.println("Receiving engineer's salary.");
    }

    @Override
    void takeLeave() {
        System.out.println("Taking leave as an engineer.");
    }

    @Override
    void attendMeeting() {
        System.out.println("Attending project discussion.");
    }

    @Override
    void quit() {
        System.out.println("Resigning from engineering job.");
    }
}