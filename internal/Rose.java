package internal;

class Rose extends Plant {
    @Override
    public void describe() {
        System.out.println("This is a Rose, a type of flower.");
    }
    public void bloom() {
        System.out.println("The rose is blooming.");
    }
}