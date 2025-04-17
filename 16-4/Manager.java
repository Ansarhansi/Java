package internal;

class Manager extends Employee {
    @Override
    public void describe() {
        System.out.println("This is a Manager supervising teams.");
    }
    public void conductMeeting() {
        System.out.println("Manager is conducting a meeting.");
    }
}