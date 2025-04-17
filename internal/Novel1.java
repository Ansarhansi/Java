package internal;

class Novel1 extends Book1 {
    @Override
    public void read() {
        System.out.println("Novel is being read for enjoyment.");
    }

    public void bookmark() {
        System.out.println("Novel page is being bookmarked.");
    }
}