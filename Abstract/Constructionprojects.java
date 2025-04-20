class Constructionprojects extends Projects {
    @Override
    void start() {
        System.out.println("Starting a construction project.");
    }

    @Override
    void plan() {
        System.out.println("Planning the construction project.");
    }

    @Override
    void execute() {
        System.out.println("Executing the construction project.");
    }

    @Override
    void monitor() {
        System.out.println("Monitoring construction work.");
    }

    @Override
    void closeProject() {
        System.out.println("Finalizing the construction project.");
    }
}