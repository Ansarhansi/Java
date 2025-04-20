class ITProjects extends Projects {
    @Override
    void start() {
        System.out.println("Starting an IT project.");
    }

    @Override
    void plan() {
        System.out.println("Planning the IT project tasks.");
    }

    @Override
    void execute() {
        System.out.println("Executing the IT project.");
    }

    @Override
    void monitor() {
        System.out.println("Monitoring the IT project progress.");
    }

    @Override
    void closeProject() {
        System.out.println("Closing the IT project successfully.");
    }
}