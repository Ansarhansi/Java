package internal;

class TennisRacket extends SportsEquipment {
    @Override
    public void performAction() {
        System.out.println("Tennis racket is hitting a ball.");
    }
    public void restring() {
        System.out.println("Tennis racket is being restrung.");
    }
}