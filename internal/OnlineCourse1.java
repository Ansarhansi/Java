package internal;

class OnlineCourse1 extends EducationalResource {
    @Override
    public void learn() {
        System.out.println("Online course is being used for learning online.");
    }
    public void submitAssignment() {
        System.out.println("Online course assignment is being submitted.");
    }
}