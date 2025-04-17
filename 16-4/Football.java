package internal;

class Football extends Sport {
    @Override
    public void describe() {
        System.out.println("This is Football, a team sport.");
    }
    public void kick() {
        System.out.println("Kicking the football.");
    }
}