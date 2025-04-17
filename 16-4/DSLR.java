package internal;

class DSLR extends Camera {
    @Override
    public void describe() {
        System.out.println("This is a DSLR camera.");
    }
    public void takePhoto() {
        System.out.println("DSLR is taking a photo.");
    }
}