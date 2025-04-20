class Teacher extends Job {
    @Override
    void work() {
        System.out.println("Teaching students.");
    }

    @Override
    void getSalary() {
        System.out.println("Receiving teacher's salary.");
    }

    @Override
    void takeLeave() {
        System.out.println("Taking leave as a teacher.");
    }

    @Override
    void attendMeeting() {
        System.out.println("Attending parent-teacher meeting.");
    }

    @Override
    void quit() {
        System.out.println("Resigning from teaching job.");
    }
}