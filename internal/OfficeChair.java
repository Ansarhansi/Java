package internal;

class OfficeChair extends Furniture1 {
    @Override
    public void assemble() {
        System.out.println("Office chair is being assembled with wheels.");
    }
    public void adjustHeight() {
        System.out.println("Office chair height is being adjusted.");
    }
}