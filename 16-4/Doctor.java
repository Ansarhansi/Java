package internal;

class Doctor extends Profession {
    @Override
    public void describe() {
        System.out.println("This is a Doctor.");
    }
    public void treatPatient() {
        System.out.println("Doctor is treating the patient.");
    }
}