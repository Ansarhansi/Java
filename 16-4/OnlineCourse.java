package internal;

class OnlineCourse extends Course {
    @Override
    public void enroll() {
        System.out.println("Enrolled in online course.");
    }

    public void attendLive() {
        System.out.println("Attending live class.");
    }
}